package com.spark.learning

object Testing2 extends App {
  def countfun(arr:Array[Int],highest:Int)={
      val sts:scala.collection.mutable.Set[Int] = scala.collection.mutable.Set()
     val sts1=sts ++ arr.toList
    val sortsts1= sts1.toList.sorted.reverse
    println(highest+" higest value is "+sortsts1(highest-1))
    val dic:scala.collection.mutable.Map[Int,Int]=scala.collection.mutable.Map()

    for(x<-sts1){
     dic.update(x,arr.count(_==x))
    }
    val sts_value:scala.collection.mutable.Set[Int] = scala.collection.mutable.Set()
    val stsval = sts_value ++ dic.values
    val lststsval = stsval.toList
    val finallst=lststsval.sorted.reverse
    for((x,y)<-dic.iterator){
      if (y!=finallst(highest-1))dic.remove(x)
    }
    dic
  }
  val arr1:Array[Int]=Array(4,6,2,5,84,31,4,4,4)
  println(countfun(arr1,1))

}
