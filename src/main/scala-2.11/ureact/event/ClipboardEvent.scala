package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait ClipboardEvent extends Event {
  type NativeEvent = dom.ClipboardEvent
  val clipboardData: dom.DataTransfer
}
