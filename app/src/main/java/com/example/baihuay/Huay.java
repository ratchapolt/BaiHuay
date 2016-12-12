package com.example.baihuay;

import java.util.Random;

public class Huay {

    public static int getRandomTwoDigits(){

        Random r = new Random();
        int r_int = r.nextInt(99 + 1);

        return r_int;
    }

    public static int getRandomThreeDigits(){

        Random r = new Random();
        int r_int = r.nextInt(999 + 1);

        return r_int;
    }

}
