/*
  n Scala, objects of String are immutable which means a constant and cannot be changed once created.
  when a new string is created by adding two strings is known as a concatenation of strings.
  Scala provides concat() method to concatenate two strings, this method returns a new string
  which is created using two strings. we can also use ‘+’ operator to concatenate two strings.

  Syntax:
    str1.concat(str2);
    Or
    "str1" + "str2";
 */
class StringConcatenationDemo {

  // This method appends argument to the string.
  def usingConcatMethod(): Unit = {
    // str1 and str2 are two strings
    var str1 = "Welcome! RAKDA DEV "
    var str2 = " to Portal"

    // concatenate str1 and str2 strings
    // using concat() function
    var newStr = str1.concat(str2);

    // Display strings
    println("String 1: " + str1);
    println("String 2: " + str2);
    println("New String: " + newStr);

    // Concatenate strings using '+' operator
    println("This is the tutorial" +
      " of Scala language" +
      " on GFG portal");
  }

  // We can add two string by using + operator
  def usingPlusOperator(): Unit = {
    var str1 = "Welcome to ";
    var str2 = "RAKDA Dev";

    // Concatenating two string
    println("After concatenate two string: " + str1 + str2);
  }


}
