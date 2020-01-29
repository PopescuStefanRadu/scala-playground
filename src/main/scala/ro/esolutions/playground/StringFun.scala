package ro.esolutions.playground

object StringFun extends App {

  // 1
  def splitByWords(value: String): List[String] = {
    value.split("\\s").toList
  }

  def palindrome(value: String): Boolean = {
    value == value.reverse
  }

  def middleOfString(value: String): Char = {
    value.charAt(value.length / 2)
  }

  def toUnicode(value: String): Array[Byte] = {
    value.getBytes("UTF-8")
  }

  println(splitByWords("Diana are mere"))
  println(palindrome("tiit"))
  println(palindrome("tiqeti"))
  println(middleOfString("abcd"))
  println(middleOfString("abcde"))

  println(toUnicode("aaa").map(_.toString).reduce(_ + " " + _))
}
