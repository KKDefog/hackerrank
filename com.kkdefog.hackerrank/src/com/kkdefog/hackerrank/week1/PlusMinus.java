package com.kkdefog.hackerrank.week1;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        //
        List<Integer> in = Arrays.asList(-4,3,-9,0,4,1);
        plusMinus(in);

    }
    public static void plusMinus(List<Integer> arr) {
        if (arr == null)
            return;

        int len = arr.size();
        if (len == 0)
            return;

        float plus =0;
        float minus=0;
        float zero=0;

        for (Integer n : arr) {
            if(n.intValue() > 0)
                plus++;
            else if(n.intValue() < 0)
                minus++;
            else
                zero++;
        }

        DecimalFormat df = new DecimalFormat("##.######");
        System.out.println(df.format(plus / len));
        System.out.println(df.format(minus / len));
        System.out.println(df.format(zero / len));
    }
}
