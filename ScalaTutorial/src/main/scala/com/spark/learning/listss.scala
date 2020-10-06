package com.spark.learning

//Lists are immutable functions

object listss {
  scala.collection.mutable.MutableList
  val mylist: List[String]= List("alpha","beta","gamma","helloo")
  val mylist1= List(12,12,12,8,1,2,3,4,5)

  def main(args: Array[String]): Unit = {
    println(mylist1.count(_==12))
    println(mylist1.sorted)
    println(mylist)
    println(mylist1)
    println(mylist(mylist.length-1))
    println(0::mylist)
    println("I am here")
    println(1::5::9::Nil)
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)
    println(List.fill(5)(3))
    println(mylist1.max)
    mylist.foreach(println)


    var sum:Int=0
    mylist1.foreach(sum+=_)
    println(sum)
    println(mylist1.reduceLeft(_ +_ ))

    for(x<-mylist){print(x)}

    println(mylist.getClass)
    mylist.distinct
    mylist.sorted
    println(mylist1.indexOf(12))
  }
}
