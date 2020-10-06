package com.spark.learning

object Conditional {
  def main(args: Array[String]): Unit = {
    val x=20;
    if (x==20){
      println("x==20");
    }
    else{
      println{"x !=20 "};
    }

    val res2=if(x==20) "x == 20" else "x !=20";
    println(res2)

    println(if(x==20) "x == 20" else "x !=20");
  }

}
