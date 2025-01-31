/*
  With split, a Scala method that acts on StringLike values,
  we specify a delimiter or many delimiters. The method returns an array.
  We can process the string's fields in this array.

  Summary. In Scala we find methods that act on StringLike types. Split is one of these functions.
  We invoke it to separate structured data within a block of text.
 */
class SplitDemo {

  def splitExample(): Unit = {
    // The string we want to split.
    val line = "brick,cement,concrete"

    // Split on each comma.
    val result = line.split(',')

    // Array length.
    println("Array length: " + result.length)

    // Print all elements in array.
    for (v <- result) println(v)
  }

  def multipleDelimiters(): Unit = {
    // This has several delimiters.
    val codes = "abc;def,ghi:jkl"

    // Use an Array argument to split on multiple delimiters.
    val result = codes.split(Array(';', ',', ':'))

    // Print result length.
    println("Array length: " + result.length)

    // Display all elements in the array.
    result.foreach(println(_))
  }

  def substringDelimiter(): Unit = {
    // Strings are separated with two-char delimiters.
    val equipment = "keyboard; mouse; screen"

    // Split on substring.
    val result = equipment.split("; ")
    result.foreach(println(_))
  }

  def regexExample(): Unit = {
    // This string has an empty item between delimiters.
    val items = "box; ; table; chair"

    // Use a Regex to split the string.
    // ... Any number of spaces or semicolons is a delimiter.
    val result = items.split("[; ]+")

    // Print our results.
    // ... No empty elements are present.
    for (r <- result) {
      println(r)
    }
  }


}
