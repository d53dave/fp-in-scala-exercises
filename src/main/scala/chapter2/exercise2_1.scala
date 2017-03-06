package chapter2

import scala.annotation.tailrec

/**
  * Created by dsere on 06/03/2017.
  */
object exercise2_1 {

  def fib(n: Int): Int = {
    assert(n >= 0)

    @tailrec
    def go(i: Int, value: Int, acc: Int = 0): Int = {
      if(i == 0) acc
      else go(i - 1, acc, value + acc)
    }

    go(n, 1)
  }

}
