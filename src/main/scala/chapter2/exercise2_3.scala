package chapter2

/**
  * Created by dsere on 07/03/2017.
  */
object exercise2_3 {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

}
