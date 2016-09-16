package ureact

import scala.scalajs.js

@js.native
object React extends js.Object {

  /**
    * Convert a given `Spec` into a `Class` which can be later used to
    * construct `Element`s with `createElement`.
    */
  def createClass[P, S](spec: Spec[P, S]): Class[P, S] =
    js.native

  /**
    * Create an `Element` from a `Class` generated via ureact.
    */
  def createElement[P, S](comp: Class[P, S], props: Props.Argument[P, S]): Element =
    js.native

  /**
    * Create an element from a "foreign" class. The first `comp` argument
    * must be something that React recognizes as a component class (an ES6
    * class, a Component Class created outside of ureact, or a functional
    * component).
    */
  def createElement(comp: js.Any, props: PlainProps): Element =
    js.native

  /**
    * Create an `Element` from a tag, a name of an element. This allows for
    * the creation of basic HTML and SVG elements. Instead of allowing for
    * variadic access for passing multiple children, present them as the
    * `"children"` prop.
    */
  def createElement(tag: String, props: PlainProps): Element =
    js.native

  val version: String =
    js.native

}
