package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_4 {
  def drop[A](l: List[A], n: Int): List[A] = {
    if (n == 0) l
    else l match {
      case Cons(_, xs) => drop(xs, n - 1)
      case _ => l
    }
  }

}
