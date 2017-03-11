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
      tail(Nil) mustEqual Nil
    }

    "└ return the tail of a list correctly" >> {
      tail(List(1)) mustEqual Nil

      tail(List(1,2,3)) mustEqual List(2,3)
    }
  }

  "Sethead should" >> {
    import chapter3.exercise3_3.setHead
    "├ correctly handle Empty List" >> {
      setHead(Nil, 1) mustEqual Nil
    }

    "└ correctly replace head" >> {
      setHead(List("41", "42"), "24") mustEqual List("24", "42")
    }
  }

  "drop should" >> {
    import chapter3.exercise3_4.drop
    "├ correclty handle Nil" >> {
      drop(Nil, 3) mustEqual Nil
    }

    "├ correclty drop some values" >> {
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

}
