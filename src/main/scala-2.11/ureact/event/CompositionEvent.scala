package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait CompositionEvent extends Event {
  type NativeEvent = dom.CompositionEvent
  val data: String
}
