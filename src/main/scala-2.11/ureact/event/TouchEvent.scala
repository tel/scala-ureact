package ureact.event

import org.scalajs.dom
import scala.scalajs.js

@js.native
trait TouchEvent extends Event {
  type NativeEvent = dom.TouchEvent

  def getModifierState(key: String): Boolean
  val altKey: Boolean
  val ctrlKey: Boolean
  val metaKey: Boolean
  val shiftKey: Boolean

  val touches: dom.TouchList
  val targetTouches: dom.TouchList
  val changedTouches: dom.TouchList
}
