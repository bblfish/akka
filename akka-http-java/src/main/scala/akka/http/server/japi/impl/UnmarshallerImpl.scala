/*
 * Copyright (C) 2009-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.http.server.japi
package impl

import akka.http.unmarshalling.FromMessageUnmarshaller
import akka.stream.FlowMaterializer

import scala.concurrent.ExecutionContext
import scala.reflect.ClassTag

case class UnmarshallerImpl[T](scalaUnmarshaller: (ExecutionContext, FlowMaterializer) ⇒ FromMessageUnmarshaller[T])(implicit val classTag: ClassTag[T])
  extends Unmarshaller[T]