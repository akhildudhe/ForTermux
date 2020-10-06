package com.spark.learning

object mapss {
    val mymap:scala.collection.mutable.Map[Int,String]=scala.collection.mutable.Map(801->"max", 802->"plank", 803->"john")
    val mymap2:Map[Int,String]=Map(801->"lui")
scala.collection.mutable.Set


  def main(args: Array[String]): Unit = {
    println(mymap)
    println(mymap(801))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.values.foreach(println))
    println(mymap.isEmpty)
    mymap.keys.foreach{key=>println(mymap(key))}
    println(mymap.contains(473738))
    println(mymap++mymap2)
    println(mymap.size)
    mymap -= 801
    mymap(801)="max"
    mymap.update(304,"terra")
    mymap.remove(801)

    println(mymap)
    for ((x,y)<-mymap.iterator){
      print(x,y)
    }
  
  }
}
