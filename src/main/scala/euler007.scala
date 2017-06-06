object euler007 extends App{

  def isPrime(number: Long): Boolean = {
    def loop(i: Long): Boolean =
      if(i*i > number) true
      else if(number%i == 0) false
      else loop(i+2)
    if(number == 2) true
    else if(number < 2 || number%2 == 0) false
    else loop(3)
  }

  def nthPrime(n: Int): Long = {
    def loop(i: Long, n: Int): Long =
      if(isPrime(i)) if(n==1) i else loop(i+1, n-1)
      else loop(i+1, n)
    loop(1, n)
  }

  println(nthPrime(10001))

}