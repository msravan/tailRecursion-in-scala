import java.util.Calendar

/**
  * @author SravanM
  */
object factorialWithTailRecursion extends App {
  val startTime =  Calendar.getInstance().getTimeInMillis
  /**
    * This method computes the factorial of a number.
    * We use tail recursion technique here.
    * We are required to use one more function i.e., inner function
    *
    * @param n An Integer > -1
    * @return The factorial of the integer
    */

  def factorial(n: Int): Int = {
    def loop(acc: Int, n :Int): Int =
      if(n == 0 ) acc
      else loop(acc * n , n-1)
    loop(1,n)
  }

  print(factorial(5))
  val endTime = Calendar.getInstance().getTimeInMillis
  println("Time in milliseconds to run with Tail Recursion "+(endTime - startTime))
}

