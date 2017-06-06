object euler005 extends App{

  def smallestMultiple(number: Int) = {
    def loop(iter: Int, factors: Vector[Int]): Int =
      if (iter > number) factors.product
      else factors.foldLeft(iter)((n, f) => if (n % f == 0) n / f else n) match {
        case 1 => loop(iter + 1, factors)
        case x => loop(iter + 1, factors :+ x)
      }
    loop(2, Vector())
  }

  println(smallestMultiple(20))

}