package com.spark.learning

class Employee(Fname:String, Lname:String, val age:Int){
  def this(firstName:String){
    this(firstName,"",0)
    println("Calling Auxillary Constructer 1")
  }
  def this(firstName:String,lastname:String){
    this(firstName,lastname,0)
    println("Calling Auxillary Constructer 2")
  }

  override def toString: String = {
    return("%s %s, age %d".format(Fname,Lname,age))
  }
}
object auxillaryConstructor1 extends App {
val prakash=new Employee("Prakash","Chauhan",29)
  println(prakash)
  val fred=new Employee("Fredi","Thomas")
  println(fred)
  val john=new Employee("John")
  println(john)
}
