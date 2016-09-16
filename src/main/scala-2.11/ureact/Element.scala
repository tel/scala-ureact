package ureact

import scala.scalajs.js
import scala.scalajs.js.JSConverters._

@js.native
trait Element extends js.Object

object Element {

  /**
    * The non-element. Silently ignored or treated as no output.
    */
  val zero: Element =
    None.orUndefined.asInstanceOf[Element]

  /**
    * A sequence of elements may be compressed all into the same element.
    * Without this idea React keys don't work properly so behavior is
    * actually subtly different when adding single children versus many at once.
    */
  implicit class OfSeq(els: Seq[Element]) {
    def toElement: Element =
      els.toJSArray.asInstanceOf[Element]
  }

  /**
    * Elements may be null, but instead of using null directly we opt in for
    * options.
    */
  implicit class OfOption(opt: Option[Element]) {
    def toElement: Element =
      opt match {
        case Some(el) => el
        case None => zero
      }
  }

}