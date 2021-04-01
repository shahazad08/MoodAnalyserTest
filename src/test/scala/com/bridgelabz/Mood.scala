package com.bridgelabz

import org.scalatest.funsuite.AnyFunSuite

class MoodTest extends AnyFunSuite  {
  test("givenMessageWhenSadShouldReturnSad") {
    val moodAnalyzer = new MoodAnalyzerClass("I am in Sad Mood")
    assert(moodAnalyzer.analyzeMood() === "SAD")
  }
  test("givenMessageWhenHappyShouldReturnHappy") {
    val moodAnalyser = new MoodAnalyzerClass("Now I am in Happy")
    assert(moodAnalyser.analyzeMood()== "HAPPY")
  }
  test("givenNullMessageShouldReturnException"){
    val moodAnalyzer = new MoodAnalyzerClass(null)
    val exception = intercept[MoodAnalyzerException]{
      moodAnalyzer.analyzeMood()
      System.out.println("Printing Analyse Mood",moodAnalyzer.analyzeMood())
    }
    assert( exception.getMessage === TypeException.NullType.toString)
  }

  test("givenEmptyMessageShouldReturnException"){
    val moodAnalyzer = new MoodAnalyzerClass("")
    val exception = intercept[MoodAnalyzerException]{
      moodAnalyzer.analyzeMood()
    }
    assert(exception.getMessage === TypeException.EmptyType.toString)
  }
}
