/**
  * Created by dsere on 06/03/2017.
  */

import org.specs2.mutable._

class Chapter2Spec extends Specification {


  "Fib should" >> {
    import chapter2.exercise2_1.fib

    "return 0 and 1 for fib(0) and fib(1)" >> {
      fib(0) mustEqual 0
      fib(1) mustEqual 1
    }

    "return 610 for fib(15) " >> {
      fib(15) mustEqual 610
    }

  }

  "isSorted should" >> {
    import chapter2.exercise2_2.isSorted

    "not blow up on trivial cases" >> {
      val arr = Array[Int]()
      val arr2 = Array[String]("Hello")

        (isSorted(arr, (a: Int, b: Int) => a < b ) mustEqual true) and
          (isSorted(arr2, (a: String, b: String) => a.compareTo(b) == -1) mustEqual true)

    }

    "return true for sorted array" >> {
      val arr = Array[Int](1, 2, 3, 4, 42)
      isSorted(arr, (a: Int, b: Int) => a < b ) mustEqual true
    }

    "return false for unsorted array" >> {
      val arr = Array[Int](1, 2, 3, 42, 4)
      isSorted(arr, (a: Int, b: Int) => a < b ) mustEqual false
    }
  }

  "Currying a function should" >> {
    import chapter2.exercise2_3.curry

    def concatStrInt(a: String, b: Int) : String = {
      a + b.toString
    }

    "create a partially applied function" >> {
      val curried = curry(concatStrInt)
      curried("4") must beAnInstanceOf[Function[Int, String]]
    }

    "return the correct result when fully applied" >> {
      curry(concatStrInt)("4")(2) mustEqual "42"
    }
  }
}
