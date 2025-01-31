/*
  StringContext is a class that is utilized in string interpolation,
  which permits the end users to insert the variables references without any intermediary
  in the processed String literals.
 */
class StringContextDemo {

  def stringContext(): Unit = {
    // Assigning values
    val name = "DarvinRakotomalala"
    val articles = 32

    // Applying StringContext with s-method
    val result = StringContext("I have written ",
      " articles on ", ".").s(articles, name)

    // Displays output
    println(result)
  }

  def ourOwnInterpolator(): Unit = {
    // Using implicit class with  
    // StringContext 
    implicit class Reverse(val x: StringContext) {

      // Defining a method 
      def revrsExample(args: Any*): String = {

        // Applying s-method 
        val result = x.s(args: _*)

        // Applying reverse method 
        result.reverse
      }
    }

    // Assigning values 
    val value = "GeeksforGeeks"

    // Displays reverse of the 
    // stated string 
    println(revrsExample"$value")
  }


}
