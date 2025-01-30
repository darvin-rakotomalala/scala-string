class StringDemo {

  def createAString(): Unit = {
    // str1 and str2 are two different strings
    var str1 = "Hello! Programmer"
    val str2: String = "DarvinRakotomalala"
    println(str1);
    println(str2);
  }

  def lengthString(): Unit = {
    var str1 = "Hello! Programmer"
    val str2: String = "DarvinRakotomalala"

    // Get the length of str1 and str2 strings
    // using length() function
    var LEN1 = str1.length();
    var LEN2 = str2.length();

    // Display both strings with their length
    println("String 1: " + str1 + ", Length: " + LEN1);
    println("String 2: " + str2 + ", Length: " + LEN2);
  }

  /*
    Syntax: str1.concat(str2);
    OR
    "welcome" + "GFG"
   */
  def concatenatingStrings(): Unit = {

    // str1 and str2 are two strings
    var str1 = "Welcome! Darvin Rakotomalala"
    var str2 = " to Portal"

    // concatenate str1 and str2 strings
    // using concat() function
    var NewStr = str1.concat(str2);

    // Display strings
    println("String 1: " + str1);
    println("String 2: " + str2);
    println("New String: " + NewStr);

    // Concatenate strings using '+' operator
    println("This is the tutorial" +
      " of Scala language" +
      " on GFG portal");
  }

  def creatingFormatString(): Unit = {
    // two strings
    var A_name = "Ankita "
    var Ar_name = "Scala|Strings"
    var total = 130

    // using format() function
    println("%s, %s, %d".format(A_name, Ar_name, total));
  }

  def capitalizeExample(): Unit = {
    // This is a string.
    val name = "rakotomalala"
    // Use the capitalize function to uppercase the first letter.
    val cap = name.capitalize
    println(cap)
  }

  def upperAndLowerCase(): Unit = {
    val name = "don quixote"
    // Uppercase all letters in the string.
    // ... The space is left unchanged.
    val upper = name.toUpperCase()
    println(upper)

    // Lowercase the letters.
    val lower = upper.toLowerCase()
    println(lower)
  }

  def multiplyString(): Unit = {
    // Multiply this string (concatenate it repeatedly).
    val letters = "abc" * 3
    println(letters)

    // Create a string of nine hyphens.
    val separator = "-" * 9
    println(separator)
  }

  def reverseString(): Unit = {
    val id = "x100"
    // Use reverse from scala.collection.IndexedSeqOptimized.
    val result = id.reverse

    // The characters in the string are now reversed.
    println(id)
    println(result)
  }

  private def testStringEquals(combined: String, left: String, right: String): Unit = {
    // The equals operator tests the String's data.
    // ... It compares characters.
    if (combined == left + right) {
      println(s"$combined = true")
    } else {
      println(s"$combined = false")
    }
  }

  /*
    String equals. In Scala the double-equals operator "==" compares the character data of Strings,
    not the object identities. Here we test string equality.
   */
  def stringEquals(): Unit = {
    // These print true.
    testStringEquals("abcd", "ab", "cd")
    testStringEquals("catdog", "cat", "dog")
    // This prints false.
    testStringEquals("xxyy", "ef", "gh")
  }

}
