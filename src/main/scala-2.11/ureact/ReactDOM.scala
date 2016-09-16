package ureact

import org.scalajs.dom
import scala.scalajs.js

@js.native
object ReactDOM extends js.Object {
  def render(rel: Element, el: dom.Element): Unit =
    js.native

  def render(rel: Element, el: dom.Element, onRender: () => Unit): Unit =
    js.native

  def unmountComponentAtNode(el: dom.Element): Unit =
    js.native

  def findDOMNode[P, S](comp: Component[P, S]): dom.Element =
    js.native
}
