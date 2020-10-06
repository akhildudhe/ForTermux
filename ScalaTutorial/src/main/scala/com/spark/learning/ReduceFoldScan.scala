package com.spark.learning

object ReduceFoldScan {
  val lst = List(1,2,3,4,5,7,10,13)
  val lst2=List("A","B","C")

  def main(args: Array[String]): Unit = {

    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft((x,y)=>{println(x + " , "+y);x+y}))
    println(lst.reduceRight((x,y)=>{println(x + " , "+y);x-y}))

    println(lst.foldLeft(100)(_ + _))
    println(lst2.foldLeft("Z")(_ + _))

    println(lst.scanLeft(100)(_+_))
    println(lst.scanLeft("Z")(_+_))
  }


}
