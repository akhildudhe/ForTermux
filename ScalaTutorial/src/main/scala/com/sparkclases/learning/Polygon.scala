package com.sparkclases.learning

class Polygon {
  def area:Double =0.0
}

object Polygon{
  def printArea(p:Polygon): Unit ={
    println(p.area)
  }
  def main(args: Array[String]): Unit = {
    var poly=new Polygon
    printArea(poly)
    var rect = new Rectangle(55.2,20.0)
    printArea(rect)

    var tri = new Triangle(22,2.0)
    printArea(tri)
  }
}