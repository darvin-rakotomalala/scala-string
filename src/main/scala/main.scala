@main
def main(): Unit =
  println("----------------------------------------------------------")
  println("Hello world! This is a Scala program to illustrate String.")

  val strExample = new StringDemo()
  println("- Create a string example")
  strExample.createAString()

  println("- Get the length of the given string")
  strExample.lengthString()

  println("- Concatenate strings example")
  strExample.concatenatingStrings()

  println("- Format string example")
  strExample.creatingFormatString()

  println("- Use the capitalize function to uppercase the first letter.")
  strExample.capitalizeExample()

  println("- ToUpperCase, toLowerCase example")
  strExample.upperAndLowerCase()

  println("- Multiply string example")
  strExample.multiplyString()

  println("- Reverse string example")
  strExample.reverseString()

  println("- String equals example")
  strExample.stringEquals()




