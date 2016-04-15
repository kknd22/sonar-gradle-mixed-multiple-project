package com.example.integration;

import org.junit.*;
import org.junit.Test;

public class TestPrimeNumberJunit {

  @Test(expected=Exception.class)
  public void testNotPrimeThrowException() throws Exception {
        PrimeNumberHelperJava.isPrime(2048);
  }

  @Test
  public void testCorrectPrime() throws Exception {
      assert(PrimeNumberHelperJava.isPrime(7) == true);
  }

  @Test
  public void testInCorrectPrime() throws Exception {
      assert(PrimeNumberHelperJava.isPrime(4) == false);
  }

}
