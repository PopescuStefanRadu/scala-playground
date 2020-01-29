package ro.esolutions.playground

import scala.annotation.tailrec

object Recursion extends App {

  def tailRecFactorial(n: Int): BigInt = {

    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, accumulator * x)
    }

    factHelper(n, 1)
  }

  def sumRec(n: Int): BigInt = {
    @tailrec
    def sumHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x == 0) accumulator
      else sumHelper(x - 1, accumulator + x)
    }

    sumHelper(n, 0)
  }


  def fibonnaci(n: Int): BigInt = {
    @tailrec
    def helper(n: Int, previous: BigInt, current: BigInt): BigInt = {
      if (n == 0) return 0
      if (n == 1) return current
      helper(n-1, current, previous + current)
    }

    helper(n, 1, 0)
  }

  println(tailRecFactorial(400))
  println(sumRec(100))
  println(fibonnaci(6))
}
