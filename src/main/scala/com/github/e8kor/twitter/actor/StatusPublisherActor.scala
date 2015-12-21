package com.github.e8kor.actor

import com.github.e8kor.twitter.model._
import akka.stream.actor.ActorPublisher

class StatusPublisherActor extends ActorPublisher[Tweet] {

  val subscription = context.system.eventStream.subscribe(self, classOf[Tweet])

  override def receive: Receive = {
    case tweet: Tweet if isActive && (totalDemand > 0) => onNext(tweet)
  }

  override def postStop(): Unit = context.system.eventStream.unsubscribe(self)

}
