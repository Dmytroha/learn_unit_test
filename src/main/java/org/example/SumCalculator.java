package org.example;

public class SumCalculator {
    // calculate sum of digit from 1 to n, throws illegalArgumentException if 0

    public int sum(int n) throws IllegalArgumentException {
        if(n<1){
            throw new IllegalArgumentException();
        }
        int result=0;
        for(int i=n;i>=1;i--){
            result += i;
        }

        return result;
    }
}
