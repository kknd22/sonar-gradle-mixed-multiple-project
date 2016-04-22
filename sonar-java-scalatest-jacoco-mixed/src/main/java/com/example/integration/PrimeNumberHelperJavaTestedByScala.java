package com.example.integration;

import java.net.Socket;
import java.util.Random;

public class PrimeNumberHelperJavaTestedByScala {

    private PrimeNumberHelperJavaTestedByScala() {
        // empty constructor
    }

    public static boolean isPrime(int x) throws Exception {

        if (x == 0 ) {
            return false;
        }

        if ( x == 1 ) {
            return false;
        }

        if ( x > 1024 ) {
            throw new Exception("Numbers this big not supported yet :-) ");
        }

        boolean result = true;
        for(int i = 2; i < x; i++ ) {
            if ( (x % i) == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public String generateSecretToken() {
        Random r = new Random();
        return Long.toHexString(r.nextLong());
    }

    public void owsap() throws Exception {
        Socket soc = new Socket("www.google.com",80);
    }

}