package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait FocusEvent extends Event {
  type NativeEvent = dom.FocusEvent
  val relatedTarget: dom.EventTarget
}
