package chapter2

object exercise2_2 {

 def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
     as match {
       case Array() | Array(_) => true
       case bs@Array(a, b, _*) => if(ordered(a, b)) isSorted(bs.tail, ordered) else false
     }
   }
}
