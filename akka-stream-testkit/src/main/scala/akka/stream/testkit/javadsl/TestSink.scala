/**
 * Copyright (C) 2015 Typesafe Inc. <http://www.typesafe.com>
 */
package akka.stream.testkit.javadsl

import akka.actor.ActorSystem
import akka.stream.javadsl.Sink
import akka.stream.testkit._

/** Java API */
object TestSink {

  /**
   * A Sink that materialized to a [[TestSubscriber.Probe]].
   */
  def probe[T](system: ActorSystem): Sink[T, TestSubscriber.Probe[T]] =
    new Sink(scaladsl.TestSink.probe[T](system))

}
