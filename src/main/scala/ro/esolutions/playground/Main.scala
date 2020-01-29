package ro.esolutions.playground

object Main extends App {
  val a = 2
  val b = 1
  println(a == 2)
  val mimi = 1 + 1

  def *(x: Int)(str: String): String = {
    return str * x
  }

  val c = 3
  val d: Int = 1
  //  println(c.hashCode)
  //  println(c.getClass)
  //  println(d.getClass)
  //  println(BigInt(2) pow 1024)
  //  a.*("hi")
  println(*(a)("asd"))
  println("asd" * 3)

  var myBlockVal = {
    var a = 3
    (tralala: AnyVal) => (a, tralala)
  }

  // todo override Int * String to make String * Int: "asd" * 3 = "asdasdasd"

  println(myBlockVal.getClass)
  println(myBlockVal(3))

  //  1.to(10).foreach((it) => {
  //    yield it
  //  })



  Seq[Int](1,2).sum

  def callByName(x: () => Long) = {
    println(x)
  }
  def callByName2(x: => Long): Unit = {
    println(x)
  }
  callByName(System.nanoTime)


}

