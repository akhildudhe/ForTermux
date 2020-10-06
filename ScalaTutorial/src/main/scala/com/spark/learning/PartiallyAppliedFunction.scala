package com.spark.learning
import java.util.Date

object PartiallyAppliedFunction {
  def log(date:Date,message:String)={
    println(date+" "+message)
  }
  def powerSum(fx:Int=>Int,x:Int):Int= {
    def sumOfX(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumOfX(f, a + 1, b)
    return sumOfX(fx,1,x)
  }
  def sum(x:Int,y:Int,z:Int):Int=x+y+z

  def main(args: Array[String]): Unit = {
    //val sum=(a:Int,b:Int,c:Int)=>a+b+c;
    val f=sum(10,20,_:Int)
    println(f(30))

    val date=new Date;
    val newlog=log(date,_:String)

    newlog("This is First Message")
    val sumOfSquare=powerSum(x=>x*x,_:Int)
    println(sumOfSquare(5))

    val sumOfCubes=powerSum(x=>x*x*x,_:Int)
    println(sumOfCubes(5))

    val s4 = sum _
    print(s4(1,2,3))
  }

}
