package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_6 {

  def init[A](l: List[A]): List[A] = {

    l match {
      case Cons(_, Nil) => Nil
      case Cons(x, xs) => Cons(x, init(xs))
      case Nil => throw new UnsupportedOperationException("init on empty list")
    }
  }

}
