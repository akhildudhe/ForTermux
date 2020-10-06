package com.spark.learning

object Functions {


  def subtract(x: Int, y: Int): Int = {
    x - y
  }

  def multiply(x: Int, y: Int): Int = x + y;

  def divide(x: Int, y: Int) = x / y;

  object Math{
    def add(x: Int, y: Int): Int = {
      x + y
    }
    def square(x:Int)=x*x;
  }

  object Math2{
    def add(x: Int=45, y: Int=15): Int = {
      x + y
    }
  }

  object Math3{
    def +(x: Int=45, y: Int=15): Int = {
      x + y
    }
  }
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Int): Int = {
      x + y
    }

    def doSomething(f:String=>Unit=println,s:String)=f(s)
    doSomething(s="Akhil Dudhe")


    println(add(2, 4))
    println(multiply(2, 4))
    println(divide(8, 4))
    println(subtract(2, 4))
    println(Math.add(2, 4))
    println(Math square 8)
    println(Math2.add(20))
    println(Math2.add(y=20))
    println(Math3.+(2,3))

    var cadd=(x:Int,y:Int)=>x+y;
    println(cadd(300,500))
  }
}
