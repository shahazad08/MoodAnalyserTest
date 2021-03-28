package com.bridgelabz

import org.scalatest.funsuite.AnyFunSuite

class MoodTest2 extends AnyFunSuite  {
  test("givenMessageWhenSadShouldReturnSad") {
    val moodAnalyzer = new MoodAnalyzerClass("I am in Sad Mood")
    assert(moodAnalyzer.analyzeMood() === "SAD")
  }
  test("givenMessageWhenHappyShouldReturnHappy") {
    val moodAnalyser = new MoodAnalyzerClass("Now I am in Happy")
    assert(moodAnalyser.analyzeMood()== "HAPPY")
  }
}
