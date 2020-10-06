package com.spark.learning

object matchExpression {
  def main(args: Array[String]): Unit = {
    val age= 100;
    val intage= "20"
    age match{
      case 20 =>println(age);
      case 30 =>println(age);
      case 40 =>println(age);
      case 50 =>println(age);
      case 60 =>println(age);
      case 19 =>println(age);
      case _ =>println("default");
    }
    val result = intage match{
      case "20" => intage;
      case "30" => intage;
      case "40" => intage;
      case "50" => intage;
      case "60" => intage;
      case "19" => intage;
      case _ =>println("default");
    }
    println("result : "+ result)
    val i = 6;
    i match{
      case 1|3|5|7|9 =>println("odd");
      case 2|4|6|8|10 =>println("even");
    }

    def myTests(x:Any)={
      x match {
        case i: Integer => "Its an Integer = " + i
        case s: String => "Its an Sting = " + s
        case d: Double => "Its a double = " + d
        case _ => "Opps! Something Else"
      }
    }
    myTests("Akhil")
  }

}
