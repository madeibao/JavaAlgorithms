
package com.math.www;

import java.util.Arrays;

public class CountPrime { 
    public int countPrimes(int n) { 
        if(n<2) {
            return 0; 
        }

        int count = 0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;(long)(i*i)<n;i++) { 
            if(isPrime[i]) { 
                for(long j=i*i;(long)j<n;j+=i) { 
                    isPrime[(int)j] = false; 
                } 
            } 
        }

        for(int i=2;i<n;i++) {
            if(isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) { 
        CountPrime c = new CountPrime();
        System.out.println(c.countPrimes(10));
    }
}