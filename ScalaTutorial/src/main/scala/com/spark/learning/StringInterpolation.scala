package com.spark.learning

object StringInterpolation {
  def main(args: Array[String]): Unit = {

    val name ="mark"
    val age=18
    println(name +" is "+age+" years old")
    println(s"$name is $age years old") //Not a type safe approach
    println(f"$name%s is $age%d years old") //
    println(s"Hello \n world")
    println(raw"Hello \n world")
    println("%s is %d years old".format(name,age))
    printf("%s is %d years old".format(name,age))

  }

}
