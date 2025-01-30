## Scala String

A **string** is a sequence of characters. In Scala, objects of String are immutable which means a constant and cannot be
changed once created.

**Strings.** String have characters, and may certain values. With string manipulation methods in Scala 3.3, we can
capitalize the first letter in this string.

**In this language**, we can access many functions that act upon strings. To uppercase the first letter, we invoke "
capitalize" on a string.

There are two ways to create a string in Scala:

- Here, when the compiler meet to a string literal and creates a string object str.
  Syntax 1 :

```
  var str = "Hello! GFG"
  or
  val str = "Hello! GFG"
```

- Here, a String type is specified before meeting the string literal.
  Syntax 2 :

```
var str: String = "Hello! GFG"
or
val str: String = "Hello! GFG"
```

### Some important string functions

Scala provides helpful functions on strings. These enable us to manipulate and use strings without custom code.

- **char charAt(int index)** : This function returns the character at the given index.
- **String replace(char ch1, char ch2)** : This function returns a new string in which the element of ch1 is replaced by
  the ch2.
- **String[] split(String reg)** : This function splits the string around matches of the given regular expression.
- **String substring(int i)** : This function returns a new string that is a substring of the given string.
- **String trim()** : This function returns a copy of the string, with starting and ending whitespace removed.
- **boolean startsWith(String prefix)** : This function is used to check if the given string starts with the specified
  prefix or not.
- **String split Examples**
- **String Strip**: stripLineEnd and stripMargin

### Technologies

- Java 17
- Sbt 1.10.17
- Scala 3.3.4
