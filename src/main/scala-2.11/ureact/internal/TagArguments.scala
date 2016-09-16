package ureact.internal

import scala.scalajs.js
import ureact._

/**
  * When creating a tag we pass in a number of fixed arguments, styles,
  * children, keys, classes, and general properties.
  */
case class TagArguments(props: Map[String, js.Any],
                        classes: Set[String],
                        key: Option[Key],
                        children: js.Array[Element],
                        styles: Map[String, String]) {

  def toPlainProps: PlainProps =
    PlainProps.OfMap(ProtoProps.build).toPlainProps

  private object ProtoProps {

    import js.JSConverters._

    type ProtoProps = Map[String, js.Any]

    def addStyles(p: ProtoProps): ProtoProps =
      if (styles.isEmpty) p else {
        p + ("styles" -> styles.toJSDictionary)
      }

    def addKey(p: ProtoProps): ProtoProps =
      key.fold(p){ (key: Key) => p + ("key" -> key.name) }

    def addClasses(p: ProtoProps): ProtoProps =
      if (classes.isEmpty) p else {
        p + ("className" -> classes.mkString(" "))
      }

    def addChildren(p: ProtoProps): ProtoProps =
      if (children.isEmpty) p else {
        p + ("children" -> children)
      }

    def build: Map[String, js.Any] =
      (addStyles _
        andThen addKey
        andThen addClasses
        andThen addChildren)(Map())
  }

}

object TagArguments {

  val zero: TagArguments = TagArguments(
    props = Map(),
    classes = Set(),
    key = None,
    children = js.Array(),
    styles = Map()
  )

  def update(args: TagArguments, mod: TagMod): TagArguments =
    mod match {
      case TagMod.AddProp(key, value) =>
        args.copy(props = args.props + (key -> value))
      case TagMod.AddClass(name) =>
        args.copy(classes = args.classes + name)
      case TagMod.SetKey(key) =>
        args.copy(key = Some(key))
      case TagMod.AddChild(child) =>
        args.copy(children = args.children :+ child)
      case TagMod.AddStyle(key, style) =>
        args.copy(styles = args.styles + (key -> style))
      case TagMod.AddChildren(children) =>
        args.copy(children = args.children :+ children.toElement)
    }

  def build(mods: Seq[TagMod]): TagArguments =
    mods.foldLeft(zero)(update)

}
