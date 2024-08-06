package com.kkdefog.hackerrank.week1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {
    public static void main(String[] args) {
        MiniMaxSum obj = new MiniMaxSum();

        //List<Integer input = Arrays.asList(1,3,5,7,9);
        List<Integer> input = Arrays.asList(140638725,436257910,953274816,734065819,362748590);
        obj.solution(input);
    }

    private void solution(List<Integer> arr) {

        Collections.sort(arr);
        System.out.println("Sorted input:" + arr);

        //int total = getTotal(arr);
        Long total = arr.stream().mapToLong(Long::valueOf).reduce(0,(a,b) -> a+b);
        System.out.println("total:" + total);
        Long max = total - arr.get(0).longValue();
        Long min = total - arr.get(arr.size() -1).longValue();

//        System.out.println("min sum:" +min);
//        System.out.println("max sum:" +max);
        System.out.println(min + " " + max);
    }

    public Long getTotal(List<Integer> arr) {
        //Sum#1 fetch total using stream api reduce function
        //Long total = Long.valueOf(arr.stream().reduce(0, (a, b) -> a+b));
        Long total = arr.stream().mapToLong(Long::valueOf).reduce(0,(a,b) -> a+b);
        System.out.println("total1:" + total);

        //Sum#2 fetch total using stream api reduce with Integer sum function
        int total2 = arr.stream().reduce(Integer::sum).get();
        System.out.println("total2:" + total2);

        //Sum#3  using IntMap
        int total3 = arr.stream().mapToInt(Integer::intValue).sum();
        System.out.println("total3:" + total3);

        //Sum4  using collector
        int total4 = arr.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("total4:" + total4);

        return total;
    }

}
