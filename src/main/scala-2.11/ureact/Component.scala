package ureact

import scala.scalajs.js

@js.native
trait Component[P, S] extends js.Object {

  val props: js.UndefOr[Props[P]]
  val state: js.UndefOr[State[S]]

  def setState(newState: State[S]): Unit
  def forceUpdate(): Unit

  // NOTE: Everything else is deprecated, so we'll just not implement it!
}
