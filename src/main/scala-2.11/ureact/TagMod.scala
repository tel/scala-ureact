package ureact

import scala.language.implicitConversions
import scala.scalajs.js

/**
  * A TagMod, tag modifier, declares a certain effect on the arguments which
  * end up passed to a tag creation (DOM) function.
  */
sealed trait TagMod

object TagMod {

  case object NoOp extends TagMod

  case class AddProp(key: String, value: js.Any) extends TagMod
  case class AddClass(name: String) extends TagMod
  case class AddStyle(key: String, style: String) extends TagMod

  case class SetKey(key: Key) extends TagMod
  case class AddChild(child: Element) extends TagMod
  case class AddChildren(children: Seq[Element]) extends TagMod

  implicit def ofKey(key: Key): TagMod = SetKey(key)
  implicit def ofChild(child: Element): TagMod = AddChild(child)
  implicit def ofChildren(children: Seq[Element]): TagMod = AddChildren(children)

}

