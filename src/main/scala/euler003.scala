object euler003 extends App{

  def largestPrime(number: Long, candidate: Long): Long =
    if (candidate*candidate > number) number
    else if (number%candidate==0) largestPrime(number / candidate, candidate)
    else largestPrime(number, candidate + 2)

  println(largestPrime(600851475143L, 3))

}