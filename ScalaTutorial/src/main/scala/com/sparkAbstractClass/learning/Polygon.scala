package com.sparkAbstractClass.learning

import com.sparkclases.learning.{Polygon, Rectangle, Triangle}

abstract class Polygon {
  def area:Double //Abstract Method
}

object Polygon{
  def printArea(p:Polygon): Unit ={
    println(p.area)
  }
  def main(args: Array[String]): Unit = {
    var rect = new Rectangle(55.2,20.0)
    printArea(rect)

    var tri = new Triangle(22,78.0)
    printArea(tri)
  }
}
