package chapter3

/**
  * Created by dsere on 11/03/2017.
  */
object exercise3_7 {

 import List.foldRight

 def length[A](as: List[A]): Int = {
  foldRight(as, 0)((_, len) => len + 1)
 }

}
