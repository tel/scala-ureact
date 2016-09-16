package ureact

import scala.scalajs.js

/**
  * PlainProps are a props object as React expects. It is difficult to type
  * PlainProps directly and so generally they're only used for interop.
  */
@js.native
trait PlainProps extends js.Object

object PlainProps {

  /**
    * Since at their core PlainProps are just a plain Javascript object we can
    * construct them from a Scala Map.
    */
  implicit class OfMap(mp: Map[String, js.Any]) {
    import js.JSConverters._
    def toPlainProps: PlainProps =
      mp.toJSDictionary.asInstanceOf[PlainProps]
  }
}
