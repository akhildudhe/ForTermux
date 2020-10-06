package com.spark.learning

object VariableLengthArgument extends App {

  def echo(x:String*)= x foreach print
  echo("Akhil"," Surendra "," Dudhe")

}
