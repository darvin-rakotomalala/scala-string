/**
 * StringBuilder. In a string append, a new string must be created—a string cannot be changed.
 * But with StringBuilder in Scala 3.3 we add data to an internal buffer.
 * With methods on the StringBuilder we append, insert, remove data. We can convert to a string.
 */
class StrBuilderExample {

  def createStrBuilder(): Unit = {
    // Create a new StringBuilder.
    // ... Append 2 strings.
    val builder = new StringBuilder()
    builder.append("cat ")
    builder.append("bird")

    // Print the StringBuilder and its length.
    println(builder)
    println(builder.length)

    // Convert StringBuilder to a string.
    val result = builder.toString()
    println(result)
  }

  def appendCharacters(): Unit = {
    // Use this as a custom format string.
    val format = "Cats: @, dogs: %"
    println(format)

    // Create a new StringBuilder.
    val builder = new StringBuilder()
    val cats = 10
    val dogs = 20

    // Loop over the format string.
    // ... Append values in place of format characters.
    for (i <- format.indices) {
      if (format(i) == '@') {
        builder.append(cats)
      }
      else if (format(i) == '%') {
        builder.append(dogs)
      }
      else {
        builder.append(format(i))
      }
    }
    // Print the results.
    val result = builder.toString()
    println(result)
  }

  def insertReplace(): Unit = {
    val builder = new StringBuilder()

    // Append initial data.
    builder.append("I like cats")
    println(builder)

    /**
     * With insert, we place a string beginning at an index.
     * Later characters are moved to be after the new string.
     */
    // Insert this string at index 1.
    builder.insert(1, " do not")
    println(builder)

    /**
     * Replace() receives a start index, and an end index (not a length).
     * We replace the first char with the arguments 0, 1.
     */
    // Replace first character with a new string.
    builder.replace(0, 1, "You")
    println(builder)
  }

  /**
   * Characters, charAt. We access StringBuilder characters with an index.
   * We can directly use the index or call charAt.
   * The first char is at 0, and the last is at the length minus one.
   */
  def charactersAndCharAt(): Unit = {
    val letters = new StringBuilder()
    letters.append("abc")

    // Get the first char.
    // ... We can access the builder like a list or array.
    val firstChar = letters(0)

    // Use charAt to get second and last chars.
    val secondChar = letters.charAt(1)
    val lastChar = letters.charAt(letters.length - 1)

    // Print our characters.
    println(firstChar)
    println(secondChar)
    println(lastChar)
  }

}
