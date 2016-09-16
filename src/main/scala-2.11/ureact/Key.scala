package ureact

/**
  * React Key values are just strings but we differentiate them by types to
  * ensure that they're used properly.
  */
class Key(val name: String) extends AnyVal

object Key {

  def apply(name: String) = new Key(name)
  def apply(name: Int) = new Key(name.toString)

}
