package chapter2

/**
  * Created by dsere on 07/03/2017.
  */
object exercise2_4 {

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

}
