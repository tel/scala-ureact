package ureact

import scala.scalajs.js

/**
  * Normally State in React is a Javascript object. This allows State updates
  * to be performed as diffs which only partially update certain keys. We
  * instead enable generic state but to do so must opt out of the use of
  * partial keys. Therefore, `State` is a thin wrapper which stores the
  * generic state under a common key.
  */
@js.native
trait State[S] extends js.Object {
  val value: S
}
