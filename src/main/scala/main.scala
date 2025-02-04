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

  println("--------------------------------------------------------------")

  val splitExample = new SplitDemo()
  println("- String Split example")
  splitExample.splitExample()

  println("- Multiple delimiters example")
  splitExample.multipleDelimiters()

  println("- Substring delimiter example")
  splitExample.substringDelimiter()

  println("- Regex example")
  splitExample.regexExample()

  println("--------------------------------------------------------------")
  val stripExample = new StripDemo()

  println("- StripLineEnd example")
  stripExample.stripLineEnd()

  println("- StripMargin example")
  stripExample.stripMargin()

  println("- StripMargin, no argument example")
  stripExample.stripMarginNoArgument()

  println("- StripPrefix, stripSuffix example")
  stripExample.stripPrefixStripSuffix()

  println("--------------------------------------------------------------")

  println("- s interpolator example")
  val interpolationEx = new StringInterpolationDemo()
  interpolationEx.sInterpolatorExample()

  println("- s interpolator function call example")
  interpolationEx.sInterpolatorFunctionCall()

  println("- f Interpolator example")
  interpolationEx.fInterpolatorExample1()
  interpolationEx.fInterpolatorExample2()

  println("- raw Interpolator example")
  interpolationEx.rawInterpolator()

  println("--------------------------------------------------------------")
  println("- StringContext example")
  val strContext = new StringContextDemo()
  strContext.stringContext()

  println("- Creating our own interpolator example")
  strContext.ourOwnInterpolator()

  println("--------------------------------------------------------------")
  println("- Regular Expressions example")
  val regexExample = new RegularExpressionsDemo()
  regexExample.regularExpressions()

  println("- Regular Expressions matching.Regex example")
  regexExample.matchingRegexExample1()
  regexExample.matchingRegexExample2()

  println("- StringBuilder appending character example")
  val strBuildExample = new StringBuilderDemo()
  strBuildExample.appendingCharacter()

  println("- StringBuilder appending String example")
  strBuildExample.appendingString()

  println("- StringBuilder appending String representation of number")
  strBuildExample.appendingStrOfNumber()

  println("- Resetting the content of the StringBuilder")
  strBuildExample.resettingContent()

  println("- Delete operation example")
  strBuildExample.deleteOperation()

  println("- Insertion operation example")
  strBuildExample.insertionOperation()

  println("- Converting StringBuilder to a String example")
  strBuildExample.convertStrBuilderToString()

  println("--------------------------------------------------------------")
  println("- Using concat() method to concat two String")
  val concatExample = new StringConcatenationDemo()
  concatExample.usingConcatMethod()

  println("- Using + operator example")
  concatExample.usingPlusOperator()




