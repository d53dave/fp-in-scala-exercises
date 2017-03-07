package chapter2

/**
  * Created by dsere on 07/03/2017.
  */
object exercise2_5 {

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

}
