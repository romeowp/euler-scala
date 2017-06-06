object euler009 extends App {

  def pythagoreanTriplet(a:Int, b:Int, target:Int): Int = target - a - b match {
        case c if c*c == a*a + b*b => a*b*c
        case _ => if (a > b) pythagoreanTriplet(a, b + 1, target) else pythagoreanTriplet(a + 1, 1, target)
  }

  println(pythagoreanTriplet(1,1,1000))

}