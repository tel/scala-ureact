package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait AnimationEvent extends Event {
  type NativeEvent = dom.AnimationEvent

  val animationName: String
  val pseudoElement: String
  val elapsedTime: Float
}
