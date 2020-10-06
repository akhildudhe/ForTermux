package com.spark.learning

object ForLoop {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      println("i using to " + i);
    }
    for (j <- 1 until (5)) {
      println("j using to " + j);
    }
    for (i<-1 to 9; j<-1 to 3){
      println("i using multiple ranges "+i+" "+j)
    }
    val lst=List(1,2,3,4,5,5,6,7);
    for(i<- lst){
      println("i using list "+i);
    }
    for(i<- lst; if i<5) {
      println("i using Filters " + i);
    }
    val result = for{i<- lst; if i<5} yield{
      i*i;
    }
    println("result = "+result);
    for(x<- 1.to(4)){
      println(x)
    }
  }
}