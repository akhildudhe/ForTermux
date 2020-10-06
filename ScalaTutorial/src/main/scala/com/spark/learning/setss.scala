package com.spark.learning

//Sets are mutable as well as immutable operations
object setss {

  val myset:Set[Int]= Set(1,2,3,4,5,2,3,7)
  val myset1: Set[String]= Set("alpha","beta","gamma")
  var myset2 = scala.collection.mutable.Set(1,2,3,4,5,32,1,2)
  val myset3:Set[Int]= Set(8,9,10,11,12,13)
  val myset4 = Set(1,2,3,4,5,"Hello")
  var myset5:scala.collection.mutable.Set[Int] = scala.collection.mutable.Set[Int]()
  def main(args: Array[String]): Unit = {
    myset2.add(6)
    println(myset4)
    println(myset)
    println(myset+10)
    println(myset)
    println(myset(3))
    println(myset + 10)
    println("I am here"+myset2)
    println(myset ++ myset3)
    println(myset.&(myset3))
    println(myset.intersect(myset3))
    println(myset.max)
    println(myset.min)

    for(x <- myset){println(x)}

    myset5 += 789
    myset5 += 78
    myset5 += 7
    myset5 += 9
    myset5 += 79
    myset5 -= 7
    println(myset5.contains(789))
    println(myset1)
myset5.head
    myset5.tail
    myset5.add(45)
    myset5.remove(65)
    myset5
    if(myset5.contains(789)==true){}
  }
}
