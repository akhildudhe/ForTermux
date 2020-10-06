package com.spark.learning

object abstractions extends App {

  var customers = Array("Mike","Zara","Abdul","Peter")

  def remindPayment(x:String)=println("Payment reminder for "+x)

  def forEach(a:Array[String],f:String=>Unit)={
    var i=0;
    for (i<- 0 to a.length-1){
      f(a(i));
    }
  }
  forEach(customers,remindPayment)


}
