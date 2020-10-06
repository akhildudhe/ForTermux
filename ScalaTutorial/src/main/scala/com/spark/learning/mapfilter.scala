package com.spark.learning

object mapfilter {
  val lst=List(1,2,3,4,5,6,7,8)
  val mymap:Map[Int,String]=Map(801->"max", 802->"plank", 803->"john")

  def main(args: Array[String]): Unit = {
    println(lst.map(_*2))
    println(lst.map(x=>"hi"*x))
    println(mymap.mapValues(x=>"Hi "+x))
    println("hello ".map(_.toUpper))

    println(List(List(1,2,3),List(3,4,5)).flatten)
    println(lst.flatMap(x=>List(x,x+1)))

    println(lst.filter(x=>x%2==0))
  }
}
