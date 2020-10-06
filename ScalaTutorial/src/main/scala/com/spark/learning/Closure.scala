package com.spark.learning
// Scala Clousures
/* A closure is a function which uses one or more variables declared outside the function.*/

object Closure {
  var number = 20;//Impure clousure
  val number1 = 40; //Pure clousure
  var add1 = (x: Int) => x + number;
  var add2 = (x: Int) => {
    number = x + number; number
  }

  def main(args: Array[String]): Unit = {
    println(add1(25));
    println(add2(40));
    println(number)

  }
}
