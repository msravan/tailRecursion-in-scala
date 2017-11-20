import java.util.Calendar

import factorialWithTailRecursion.endTime

/**
  * @author SravanM
  */
object factorialWithRecursion extends App{
  val startTime =  Calendar.getInstance().getTimeInMillis
  /**
   * This method computes the factorial of a number.
    * We use recursion technique here.
    *
   * @param n An Integer > -1
   * @return The factorial of the integer
   */
    def factorial(n: Int): Int = {
      if(n == 0) 1
      else n * factorial(n-1)
    }
  print(factorial(5))
  val endTime =  Calendar.getInstance().getTimeInMillis
  println("Time in milliseconds to run with Recursion "+(endTime - startTime))
}
