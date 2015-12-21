package com.github.e8kor.twitter

package object model {

  import java.util.Date

  final case class Author(handle: String)

  final case class Hashtag(name: String)

  case class Tweet(author: Author, timestamp: Date, body: String) {

    def hashtags: Set[Hashtag] = {

      body.split(" ").collect {
        case word if word.startsWith("#") => Hashtag(word)
      }.toSet[Tweet]

    }

  }

  final object EmptyTweet extends Tweet(Author("None"), new Date(), "")

}
