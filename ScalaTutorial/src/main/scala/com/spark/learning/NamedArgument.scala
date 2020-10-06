package com.spark.learning

object NamedArgument extends App {

  def doSomething(f:String=>Unit,s:String)=f(s)
  doSomething(s="Akhil Dudhe",f=x=>println("<br>"+x+"</br>"))
}
