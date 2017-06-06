object euler006 extends App{

  val numbers = 1 to 100
  def square(x: Int) = x * x

  println(square(numbers.sum) - numbers.map(square).sum)

}