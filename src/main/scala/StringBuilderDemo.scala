/*
  A String object is immutable, i.e. a String cannot be changed once created.
  In situations where you need to perform repeated modifications to a string,
  we need StringBuilder class. StringBuilder is utilized to append input data to the internal buffer.
  This operation comprises appending data, inserting data, and removing data.

  Important points:
    - The StringBuilder class is beneficent for mutable strings to extend effectively.
    - The instance of StringBuilder is utilized like a String.
    - Strings of Scala are immutable so, when you require a mutable String then you can use StringBuilder.
 */
class StringBuilderDemo {

  def appendingCharacter(): Unit = {
    // Creating StringBuilder
    val x = new StringBuilder("Author");

    // Appending character
    val y = (x += 's')

    // Displays the string after
    // appending the character
    println(y)
  }

  def appendingString(): Unit = {
    // Creating StringBuilder
    val x = new StringBuilder("Authors");

    // Appending String
    val y = (x ++= " of DarvinRakotomalala")

    // Displays the string after
    // appending the string
    println(y)
  }

  def appendingStrOfNumber(): Unit = {
    // Creating StringBuilder
    val x = new StringBuilder("Number of Contributors : ");

    // Appending String
    // representation of number
    val y = x.append(800)

    // Displays the string after
    // appending the number
    println(y)
  }

  def resettingContent(): Unit = {
    // Creating StringBuilder
    val x = new StringBuilder("Hello")

    // Resetting the content
    val y = x.clear()

    // Displays empty content
    println(y)
  }

  /*
    This operation is helpful in deleting characters from the content of the StringBuilder.
   */
  def deleteOperation(): Unit = {
    // Creating StringBuilder
    val q = new StringBuilder("Computer Science")

    // Deleting characters
    // Here, q.delete(i, j) is utilized to delete the character indexed from i to (j – 1).
    val r = q.delete(1, 3)

    // Displaying string after
    // deleting some characters
    println(r)
  }

  /*
    This operation is helpful in inserting Strings.
   */
  def insertionOperation(): Unit = {
    // Creating StringBuilder
    val q = new StringBuilder("Dev CS portal")

    // inserting strings
    // Here, q.insert(i, “s”) is utilized to insert the String (s) at index i.
    val r = q.insert(4, "is a ")

    // Displays string after
    // insertion of required string
    println(r)
  }

  /*
    StringBuilder can be converted to a String
   */
  def convertStrBuilderToString(): Unit = {
    // Creating StringBuilder
    val q = new StringBuilder("DarvinRakotomalala")

    // Applying conversion operation
    // Here, q.toString is utilized to convert StringBuilder to a string.
    val r = q.toString

    // Displays String
    println(r)
  }

}
