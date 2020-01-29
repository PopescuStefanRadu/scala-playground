package ro.esolutions.playground

object Functions extends App {

  //1
  val a = (name: Any, age: Any) => s"Hi I'm $name and $age years old"

  println(a("radu", "10"))

  //2
  val avg3 = (a: Int, b: Int, c: Int) => (a + b + c) / 3

  def avg4(a: Int, b: Int, c: Int): Int = (a + b + c) / 3

  println(avg3)

  //  Functions.avg4(_,_,_)
  def test(a: Int, b: Int): Int = avg4(1, a, b) // << todo what the fuck
  //  println(avg3(1,2,3))
  println(test(2, 3))

  //3
  // check if leap year, :(

  //4 takes Int => -1 if negative 0 for 0, 1 positive
  val compareTo0 = (x: Int) => if (x == 0) 0 else if (x > 0) 1 else -1
  println {
    s"${compareTo0(5)} ${compareTo0(-1)} ${compareTo0(0)}"
  }

}
