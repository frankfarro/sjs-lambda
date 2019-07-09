package vv
import scala.scalajs.js.annotation._


//@JSExportTopLevel("foo")
object MainApp  {

  def main(args: Array[String]): Unit = {
    println("Starting 'sjs'...")
  }
  @JSExport("apply")
  def apply(event: Object, context: Object): String = {
    println("Scala JS, Hello world!")
    println(event)
    println(context)
    "Completed Lambda Hello World"
  }

}
