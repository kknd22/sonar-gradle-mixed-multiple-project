package com.example.integration

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class TestPrimeNumberScalaOnJava extends FunSuite {

  test("isPrime should throw an Exception for 'big' numbers") {
    intercept[Exception] {
      PrimeNumberHelperJavaTestedByScala.isPrime(2048)
    }
  }

  test("7 should be reported as a prime number") {
    assert(PrimeNumberHelperJavaTestedByScala.isPrime(7) == true)
  }

  test("4 should be reported as non-prime number") {
    assert(PrimeNumberHelperJavaTestedByScala.isPrime(4) == false)
  }

  test("0 should be reported as non-prime number") {
    assert(PrimeNumberHelperJavaTestedByScala.isPrime(0) == false)
  }



}
