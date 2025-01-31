/*
  With special strip functions in the Scala language we process these whitespace sequences.
  We eliminate them. We handle prefixes and suffixes.

  Summary. With the strip methods in Scala, we clear unwanted characters (like newlines, spaces)
  from strings. This is a useful and often-needed feature.
 */
class StripDemo {

  def stripLineEnd(): Unit = {
    val name = "Thomas Browne\n"

    // Remove end newline from the string.
    val result = name.stripLineEnd

    // Print the result.
    println(s"[$result]")
  }

  def stripMargin(): Unit = {
    // These strings have margins.
    val lines = List("  :cat", "  :dog")

    for (line <- lines) {
      // Remove all blanks and a separator character at start of string.
      val result = line.stripMargin(':')
      // Print results.
      println(s"[$line] $result")
    }
  }

  def stripMarginNoArgument(): Unit = {
    val data = " |Example"

    // With this version of stripMargin, the vertical bar is removed.
    val result = data.stripMargin

    // Print the result.
    println(s"[$result]")
  }

  /*
    StripPrefix, stripSuffix. These methods are similar to startsWith and endsWith,
    but they also remove the starting and ending substrings.
   */
  def stripPrefixStripSuffix(): Unit = {
    val input = "x:cat:end"

    // Remove prefix.
    val prefixRemoved = input.stripPrefix("x:")

    // Remove suffix.
    val suffixRemoved = input.stripSuffix(":end")

    // Remove prefix and suffix.
    val bothRemoved = input.stripPrefix("x:").stripSuffix(":end")

    // Print stripped strings.
    println("Input value: " + input)
    println(prefixRemoved)
    println(suffixRemoved)
    println(bothRemoved)
  }

}
