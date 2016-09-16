package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait WheelEvent extends Event {
  type NativeEvent = dom.WheelEvent

  val deltaMode: Int
  val deltaX: Int
  val deltaY: Int
  val deltaZ: Int
}
