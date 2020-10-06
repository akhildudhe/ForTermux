package com.spark.learning
import Array._
//Arrays are mutable with fixed length and type
object Arrayss {
  val myarry: Array[Int]= new Array[Int](4)
  val myarry1= Array(1,2,3,4,5,6,5)
  val myarr2 = new Array[Int](5);


  def main(args: Array[String]): Unit = {
    myarry(0)= 20;
    myarry(1)= 30;
    myarry(2)= 40;
    myarry(3)= 50;
    println(myarry)
    for(i<-0 to myarry.length-1)println(myarry(i))
    println()
    for(i<- myarry)println(i)
    val result = concat(myarry1,myarry)
    val firstTen = (1 to 10).toList
//    # List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(firstTen.groupBy(_ > 5)(true))
    myarr2.max
    myarr2.sorted
    myarr2.reverse
    myarr2.head
    myarr2.tail
    myarr2(1)
    myarry.size
    myarry.length
    println("I am here")
    println(myarry.slice(1,3).foreach(println))
    for (x<-myarry){println(x)}
    myarry.contains(5)
    println("I am here")
    print(myarry1.indexOf(4,myarry1.size-1))
    println(myarry1.count(_<5))
  }

}
