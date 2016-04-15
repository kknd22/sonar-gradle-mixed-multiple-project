package com.example.integration

import org.scalatest._

class TestPrimeNumberOnScala extends FunSuite {

  test("isPrime should throw an Exception for 'big' numbers") {
    intercept[Exception] {
      PrimeNumberHelperScala.isPrime(2048);
    }
  }

  test("7 should be reported as a prime number") {
    assert(PrimeNumberHelperScala.isPrime(7) == true)
  }

  test("4 should be reported as non-prime number") {
    assert(PrimeNumberHelperScala.isPrime(4) == false)
  }

  test("0 should be reported as non-prime number") {
    assert(PrimeNumberHelperScala.isPrime(0) == false)
  }

  test("1 should be reported as non-prime number") {
    assert(PrimeNumberHelperScala.isPrime(1) == false)
  }


}
