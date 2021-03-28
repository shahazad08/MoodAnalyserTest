package com.bridgelabz

class MoodAnalyzerClass(message:String) {
  def analyzeMood(): String = {
    if(message.contains("Sad")) {
      "SAD"
    }
    else {
      "HAPPY"
    }
  }
}
