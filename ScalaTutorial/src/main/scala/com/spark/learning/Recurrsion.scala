package com.spark.learning

object Recurrsion {
  def main(args: Array[String]): Unit = {

    def simpleRecursion(n:Int):Int={
      if(n<=0)
        return 1
      else
        n * simpleRecursion(n-1)
    }
    def tailRecursion(n:Int,f:Int):Int={
      if(n<=0)
        return f
      else
        return tailRecursion(n-1,n*f)
    }
    print(tailRecursion(5,1))

    def newtailRecursion(i:Int):Int={
      println("You called Factorial for "+i)
      def tFactorial(n:Int,f:Int):Int={
        if(n<=0) f
        else tFactorial(n-1,n*f)
      }
      return tFactorial(i,1)
    }
  }

}
