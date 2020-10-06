package com.spark.learning

class strict{
  val e = {println("strict");9}
}

class LazyEval{
  lazy val l={ println("Lazy"); 10}
}

object LazyEval {
  def main(args: Array[String]): Unit = {
    val x = new strict
    val y = new LazyEval

    println(x.e)
    println(y.l)
  }
}
