package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_3 {

  def setHead[T](l: List[T], elem: T): List[T] = {
    l match {
      case Nil => Nil
      case Cons(_, xs) => Cons(elem, xs)
    }
  }

}
