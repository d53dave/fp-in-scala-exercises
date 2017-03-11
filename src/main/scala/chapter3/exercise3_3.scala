package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_3 {

  def setHead[T](l: List[T], elem: T): List[T] = {
    l match {
      case Nil => throw new UnsupportedOperationException("setHead on empty list")
      case Cons(_, xs) => Cons(elem, xs)
    }
  }

}
