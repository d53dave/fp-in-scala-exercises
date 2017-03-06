/**
  * Created by dsere on 06/03/2017.
  */

import org.specs2.mutable._

class Chapter2Spec extends Specification {


  "Fib should " >> {
    import chapter2.exercise2_1.fib

    "Return 0 and 1 for fib(0) and fib(1)" >> {
      fib(0) mustEqual 0
      fib(1) mustEqual 1
    }

    "return 610 for fib(15) " >> {
      fib(15) mustEqual 610
    }

  }
}
