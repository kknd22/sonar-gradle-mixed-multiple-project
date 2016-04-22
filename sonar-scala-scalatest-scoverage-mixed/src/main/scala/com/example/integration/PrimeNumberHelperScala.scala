package com.example.integration

import java.net.Socket
import java.util.Random


object PrimeNumberHelperScala {

    @throws(classOf[Exception])
    def isPrime(x : Int) : Boolean = {

        if (x == 0 ) {
            return false
        }

        if ( x == 1 ) {
            return false
        }

        if ( x > 1024 ) {
            throw new Exception("Numbers this big not supported yet :-) ")
        }

        for(i <- 2 to (x-1) ) {
            if ( (x % i) == 0) {
                return false
            }
        }

        return true
    }

    def scaGenerateSecretToken() : String  = {
        val r = new Random()
        return r.nextLong().toHexString;
    }

    @throws[Exception]
    def scaOwsap() {
        val soc: Socket = new Socket("www.google.com", 80)
    }
}