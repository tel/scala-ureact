package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait UIEvent extends Event {
  type NativeEvent = dom.UIEvent

  val detail: Int

  // AbstractView not implemented in org.scalajs.dom!
  // val view: dom.AbstractView
}
