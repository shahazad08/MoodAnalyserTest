package com.bridgelabz

class MoodAnalyzerException(exceptionMsg:TypeException.Value ) extends Exception(exceptionMsg.toString){}
class MoodAnalyzerClass(message:String) {
  def analyzeMood(): String = {
    try {
      if (message.length==0){
        throw new MoodAnalyzerException(TypeException.EmptyType)
      }
      if (message.contains("Sad"))
        "SAD"
      else
        "HAPPY"
    }
    catch {
      case nullPointerException: NullPointerException=>
        throw new MoodAnalyzerException(TypeException.NullType)
    }
  }
}
