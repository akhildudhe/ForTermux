package com.spark.learning

//Scala - Class

//           Getter?    Setter?
//-----------------------------
//var         yes        yes
//val         yes        no
//default     no         no


class user1(var name:String, var age:Int)
class user2(val name:String, var age:Int)
class user3(private var Name:String, private var Age:Int) {
  def printFunc{println(Name +" "+ Age)}
  def setFunc(name:String,age:Int):Unit={
    Name=name
    Age=age

  }
}
object classsess {


  def main(args: Array[String]): Unit = {
    var usr1 =new user1("Max",28)
    println(usr1.name)
    val usr2 = new user3("Joy",28)
    usr2.printFunc
    usr2.setFunc("Akhil",18)
    usr2.printFunc
  }
}
