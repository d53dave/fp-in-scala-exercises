package chapter3

/**
  * Created by dsere on 10/03/2017.
  */
object exercise3_2 {
  // Implement the function tail for removing the first element of a List. Note that the
  // function  takes  constant  time.  What  are  different  choices  you  could  make  in  your
  // implementation if the List is Nil? We’ll return to this question in the next chapter.

  def tail[A](l: List[A]): List[A] = l match {
    case Cons(_, a) => a
    case _ => Nil
  }

}
