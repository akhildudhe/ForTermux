package com.spark.learning

//Scala -Options(Some or None)

object optionss {
  val lst=List(1,2,3)
  val mymap:Map[Int,String]=Map(801->"max", 802->"plank", 803->"john")
  val opt:Option[Int]=Some(5)

  def main(args: Array[String]): Unit = {
    println(lst.find(_<5))
    println(lst.find(_<2).get)
    println(lst.find(_>5))
    println(lst.find(_>5).getOrElse(0))
    // println(mymap.get(5)) Throws error
    println(mymap.get(5).getOrElse("No Name Found"))
    println(opt)
    println(opt.get)
  }
}
