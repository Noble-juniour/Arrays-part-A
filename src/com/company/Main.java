package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       //97 == a in the alphabet
        char[]  alpha = new char[26];

        for(int i = 0; i < 26; i++)
        {
         alpha[i] = (char) (97 + i);
         }

        System.out.println(Arrays.toString(alpha));
    }
}
