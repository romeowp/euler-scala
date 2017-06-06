object euler010 extends App{

  def isPrime(number: Long): Boolean = {
    def loop(i: Long): Boolean =
      if(i*i > number) true
      else if(number%i == 0) false
      else loop(i+2)
    if(number == 2) true
    else if(number < 2 || number%2 == 0) false
    else loop(3)
  }

  def sumOfPrimes(below: Long): Long = {
    def loop(i: Long, sum: Long): Long =
      if(i >= below) sum
      else loop(i+2, if(isPrime(i)) sum+i else sum)
    loop(3, 2)
  }

println(sumOfPrimes(2000000))

}
