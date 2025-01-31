/*
  String Interpolation refers to substitution of defined variables or expressions in a given String
  with respected values. String Interpolation provides an easy way to process String literals.
  To apply this feature of Scala, we must follow few rules:

  - String must be defined with starting character as s / f /raw.
  - Variables in the String must have ‘$’ as prefix.
  - Expressions must be enclosed within curly braces ({, }) and ‘$’ is added as prefix.

  Syntax:
    // x and y are defined
    val str = s"Sum of $x and $y is ${x+y}"
 */
class StringInterpolationDemo {

  def sInterpolatorExample(): Unit = {
    val x = 20
    val y = 10

    // without s interpolator
    val str1 = "Sum of $x and $y is ${x+y}"

    // with s interpolator
    val str2 = s"Sum of $x and $y is ${x + y}"

    println("str1: " + str1)
    println("str2: " + str2)
  }

  // adding two numbers
  def add(a: Int, b: Int): Int = {
    a + b
  }

  def sInterpolatorFunctionCall(): Unit = {
    val x = 20
    val y = 10

    // without s interpolator
    val str1 = "Sum of $x and $y is ${add(x, y)}"

    // with s interpolator
    val str2 = s"Sum of $x and $y is ${add(x, y)}"

    println("str1: " + str1)
    println("str2: " + str2)
  }

  // f Interpolator: This interpolation helps in formatting numbers easily.
  def fInterpolatorExample1(): Unit = {
    val x = 20.6

    // without f interpolator
    val str1 = "Value of x is $x%.2f"

    // with f interpolator
    // printing up to 2 decimal
    val str2 = f"Value of x is $x%.2f"

    println("str1: " + str1)
    println("str2: " + str2)
  }

  def fInterpolatorExample2(): Unit = {
    val x = 11

    // without f interpolator
    val str1 = "Value of x is $x%04d"

    // with f interpolator
    val str2 = f"Value of x is $x%04d"

    println(str1)
    println(str2)
  }

  /*
    raw Interpolator: String Literal should start with ‘raw’. This interpolator treats
    escape sequences same as any other character in a String.
   */
  def rawInterpolator(): Unit = {
    // without raw interpolator
    val str1 = "Hello\nWorld"

    // with raw interpolator
    // printing escape sequence
    val str2 = raw"Hello\nWorld"

    println("str1: " + str1)
    println("str2: " + str2)
  }

}
