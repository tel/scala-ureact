package ureact

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * Props in React are generally Javascript objects whose structure is
  * entirely up to the Component's class for interpretation. Unfortunately,
  * this is both (a) not entirely true and (b) not a great fit for a
  * statically typed language like Scala.
  *
  * The Props facade bypasses this whole notion by wrapping a generically
  * typed value in a simple Javascript object which satisfies the Props
  * interface.
  */
@js.native
trait Props[P] extends js.Object {
  val value: P
}

object Props {

  /**
    * When Props are *passed in* during React component creation they may have
    * two special keys (`key` and `ref`).
    */
  @js.native
  trait Argument[P, S] extends Props[P] {
    val key: js.UndefOr[String]
    val ref: js.UndefOr[js.Function1[Component[P, S] | Null, Unit]]
  }

}