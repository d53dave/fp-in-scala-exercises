package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_5 {

  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
   l match {
     case lst@Cons(x, xs) => if (f(x)) dropWhile(xs, f) else lst
     case Nil => Nil
   }
  }

}
