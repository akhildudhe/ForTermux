package com.spark.learning

trait constantine{
  val pi:Double = 3.14
}


object Testing extends App with constantine {
  println(pi)
  def sumOfX(f:Int=>Int)(a:Int,b:Int):Int= if (a>b) 0 else f(a)+sumOfX(f)(a+1,b)
  val x =sumOfX(x=>x*x*x)_
  println(x(1,5))

  def getOps(c:Int)=(a:Int)=>{if (c>0){a*2} else{a*3}}

  val y=(a:Int)=>{a*2}

  def myTest(x:Any)={
    x match {
      case i: Integer => "It is an Integer" + i
      case s: String => "It is a String " + s
      case d: Double => "It is a double " + d
      case _ => "Opps! Something else"

    }
  }

  println(myTest("Akhil"))
val nm = "akhil"
  nm match{
    case "akhil"=> println("This is akhil")
  }
}
