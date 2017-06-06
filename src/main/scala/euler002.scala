object euler002 extends App{

  def fibonacci(previous: Int, current: Int, evenSum: Int): Int =
    if (current > 4e6) evenSum
    else if (current % 2 == 0) fibonacci(current, previous + current, evenSum + current)
    else fibonacci(current, previous + current, evenSum)

  println(fibonacci(1, 2, 0))

}