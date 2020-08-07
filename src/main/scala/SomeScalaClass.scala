class SomeScalaClass {
  val someScalaField : Int = 0;

}

object SomeScalaClass {
  def main(args : Array[String]) = {
    println("Running Scala class")
    println{
      "Printing scala expression -> " +
      new SomeScalaClass().someScalaField
    }
    println{
      "Printing java expression -> " +
      new SomeJavaClass().someField
    }
  }

}