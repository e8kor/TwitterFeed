package com.github.e8kor.twitter

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext
import akka.stream.ActorMaterializer
import akka.actor.ActorSystem

object Application extends Bootstrap with App {

  val configuration = ConfigFactory.load()

  println("Initializing application...")

}

abstract class Bootstrap {

  def configuration: Config

  implicit val actorSystem = ActorSystem("system")

}

trait MaterializerBootstrap {
  self: Bootstrap =>

  private lazy val executionService = Executors.newCachedThreadPool()

  implicit lazy val executionContext = ExecutionContext.fromExecutorService(executionService)

  implicit lazy val materializer = ActorMaterializer()

  }
