package com.spark.learning
// Scala- Currying
/*Currying is the technique of transforming a function that
* takes multiple arguments into a function
* that takes a single argument */
object Currying {
  def add(x:Int,y:Int)=x+y
  def add2(x:Int) = (y:Int)=> x+y;
  def add3(x:Int)(y:Int)=x+y;
  def sum(x:Int,y:Int,z:Int):Int=x+y+z

  def main(args: Array[String]): Unit = {
    println(add(20,30));
    println(add2(20)(40));
    val sum50= add2(40);
    println(sum50(70));
    println(add3(120)(328))
    val sum80= add3(80)_
    println(sum80(70))

    val s4=sum _
    print(s4(1,2,3))
  }
}
