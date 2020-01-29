package ro.esolutions.playground

import scala.util.Random

object Lists extends App {
  val ints = Seq.fill(10)(Random.nextInt(10))

  val sum = ints.sum
  println(sum)
}

