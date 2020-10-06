package com.spark.learning

object functionLiteral extends App {

  val myFunc1:(Int,String)=>String=(x:Int,y:String)=>(y+x+y):String
  println(myFunc1(5,"Akhil"))


  val myFunc2=(x:Int,y:String)=>{x+y+x}
  println(myFunc2(5,"Akhil"))

  val myFunc3:String=>(String=>String)=(prefix:String)=>(s:String)=>prefix+" "+s
  println(myFunc3("Akhil")("Dudhe"))

//  val myFunc4:String=>String=(x:String)=>(y:String)=>x+" "+y
//  println(myFunc4("Akhil")("Shah"))

//  val myFunc4:(Int,Int,f:(Int)=>Int):Int=(f:String)=>String=(x:String)=>f(x)
//  println(myFunc4("Akhil")("Shah"))
//
//  val myFunc4:(Int,Int,f:(Int,Int)=>Int)=(x:Int,y:Int,f(Int,Int))=>{f(x,y)}
//  println(myFunc4("Akhil")("Shah"))

  val customers=List("donald","angela","larry","narendra","vladimir")
  customers.map((x:String)=>x.capitalize)
  customers.map(_.capitalize)



}
