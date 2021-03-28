package com.bridgelabz

class InvalidAgeException(s:String) extends Exception(s){}
class ExceptionExample{
  @throws(classOf[InvalidAgeException])
  def validate(age:Int){
    if(age<18){
      throw new InvalidAgeException("Not eligible")
    }else{
      println("You are eligible")
    }
  }
}
object MainObject{
  def main(args:Array[String]){
    var e = new ExceptionExample()
    try{
      e.validate(5)
    }catch{
      case e : Exception => println("Exception Occured : "+e)
    }
  }
}
