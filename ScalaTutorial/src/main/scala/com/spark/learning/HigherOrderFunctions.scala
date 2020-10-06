package com.spark.learning

object HigherOrderFunctions {
  def math1(x:Double,y:Double, f:(Double, Double)=>Double):Double=f(x,y);
  def math2(x:Double,y:Double,z:Double, f:(Double, Double)=>Double):Double=f(f(x,y),z);
  def intDecorator(x:Int,f:(Int)=>String)=f(x)

  def greetSomeone1(prefix:String)={(name:String)=>println(prefix+ " "+name)}
  def greetSomeone2(prefix:String)={def f2(name:String)=println(prefix+ " "+name);f2 _}

  def f1(x:Int)={Math.sqrt(x);  (y:Int)=>Math.sqrt(x+y)}
  def f12(x:Int)=(y:Int)=>Math.sqrt(x+y)

  val f13=(x:Int)=>{(y:Int)=>Math.sqrt(x+y)}

  def main(args: Array[String]): Unit = {
    val result1=math1(50,20,(p,q)=> p+q)
    val result2=math2(50,20,10,(p,q)=> p+q)
    val result3=math2(50,20,50,_ + _)
    val result4=math2(60,20,50,_ max _)
    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(intDecorator(5,(y)=>"["+y+"]"))
    println(intDecorator(5,(y:Int)=>"<br>"+y+"</br>"))

    val hiSomeone = greetSomeone1("Hi")
    hiSomeone("Akhil")

    val helloSomeone = greetSomeone2("Hi")
    helloSomeone("Dudhe")
    println("I am here "+f12(4)(12))
      }

}
