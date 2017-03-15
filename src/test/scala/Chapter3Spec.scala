import org.specs2.mutable._

class Chapter3Spec extends Specification {

  import chapter3.List
  import chapter3.Nil


  "Exercise 1 should " >> {
    "└ result in x == 3" >> {
      chapter3.exercise3_1.x mustEqual 3
    }
  }

  "Tail should" >> {
    import chapter3.exercise3_2.tail

    "├ return Nil when given Nil" >> {
      tail(Nil) must throwA[UnsupportedOperationException]
    }

    "└ return the tail of a list correctly" >> {
      tail(List(1)) mustEqual Nil

      tail(List(1,2,3)) mustEqual List(2,3)
    }
  }

  "setHead should" >> {
    import chapter3.exercise3_3.setHead
    "├ do nothing when given Nil" >> {
      setHead(Nil, 1) must throwA[UnsupportedOperationException]
    }

    "└ correctly replace head" >> {
      setHead(List("41", "42"), "24") mustEqual List("24", "42")
    }
  }

  "drop should" >> {
    import chapter3.exercise3_4.drop
    "├ do nothing when given Nil" >> {
      drop(Nil, 3) mustEqual Nil
    }

    "├ correctly drop some values" >> {
      val list = List(1, 2, 3, 4)

      (drop(list, 0) mustEqual List(1, 2, 3, 4)) and
      (drop(list, 1) mustEqual List(2, 3, 4))    and
      (drop(list, 2) mustEqual List(3, 4))
    }

    "├ correctly drop everything" >> {
      drop(List(1,2,3), 3) mustEqual Nil
    }

    "└ correctly drop when n larger than list length" >> {
      drop(List(1,2,3), 5) mustEqual Nil
    }

  }

  "dropWhile should" >> {
    import chapter3.exercise3_5.dropWhile
    "├ do nothing when given Nil" >> {
      def f: Int => Boolean = _ => false

      dropWhile(Nil, f) mustEqual(Nil)
    }

    "├ correctly drop values" >> {
      def f: Int => Boolean = _ < 3


      (dropWhile(List(4, 5, 6), f) mustEqual List(4, 5, 6))  and
      (dropWhile(List(2, 3, 4), f) mustEqual List(3, 4))     and
      (dropWhile(List(1, 2, 3), f) mustEqual List(3))
    }

    "└ correctly drop all values" >> {
      def f: Int => Boolean = _ => true

      dropWhile(List(1, 2, 3), f) mustEqual Nil
    }
  }

  "init should" >> {
    import chapter3.exercise3_6.init
    "├ correctly handle Nil" >> {
      init(Nil) must throwA[UnsupportedOperationException]
    }

    "└ correctly get init of lists" >> {
      (init(List(1)) mustEqual List())       and
      (init(List(1, 2)) mustEqual List(1))   and
      (init(List(1, 2, 3)) mustEqual List(1, 2))
    }
  }

  "length should" >> {
    import chapter3.exercise3_7.{length => foldLength}

    "├ return the 0 for empty list" >> {
      foldLength(Nil) mustEqual 0
    }

    "└ return 3 for a List(1,2,3)" >> {
      foldLength(List(1,2,3)) mustEqual 3
    }
  }
}
