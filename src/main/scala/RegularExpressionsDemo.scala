import scala.util.matching.Regex

/*
  Regular Expressions explain a common pattern utilized to match a series of input data so,
  it is helpful in Pattern Matching in numerous programming languages.
  In Scala Regular Expressions are generally termed as Scala Regex.
 */
class RegularExpressionsDemo {

  def regularExpressions(): Unit = {
    // Applying r() method
    val portal = "DarvinRakotomalala".r
    val CS = "DarvinRakotomalala is a CS portal."

    // Displays the first match
    println(portal findFirstIn CS)
  }

  def matchingRegexExample1(): Unit = {
    // Applying Regex class
    val x = new Regex("Darvin")
    val myself = "My name is Darvin Rakotomalala."

    // replaces first match with the String given below
    println(x replaceFirstIn(myself, "Tojo"))
  }

  def matchingRegexExample2(): Unit = {
    // Applying Regex class
    val Geeks = new Regex("(G|g)fG")
    val y = "GfG is a CS portal. I like gfG"

    // Displays all the matches separated
    // by a separator
    println((Geeks findAllIn y).mkString(", "))
  }

}
