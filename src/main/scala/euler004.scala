object euler004 extends App{

  def largestPalindrome(max: Int) = {
    def isPalindrome(digits: Seq[Int]): Boolean = {
      if (digits.isEmpty || digits.length == 1) true
      else if (digits.head != digits.last) false
      else isPalindrome(digits.tail.reverse.tail)
    }
    def loop(a: Int, b: Int): Int = {
      val product: Int = a * b;
      if(a<101) 0
      else if (isPalindrome(product.toString.map(_.asDigit))) math.max(product, loop(a - 1, max))
      else if (b > a) loop(a, b - 1)
      else loop(a - 1, max)
    }
    loop(max, max)
  }

  println(largestPalindrome(999))

}