package com.kkdefog.hackerrank.week1;

import java.util.HashMap;
import java.util.Map;

/*
https://www.hackerrank.com/challenges/one-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-one

 Convert AM/PM time to 24hr time
 eg.
    '12:01:00PM' ---> '12:01:00'
    '12:45:00AM' ---> '00:45:00'
 */
public class TimeConversion {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {

        }

        TimeConversion tc = new TimeConversion();
        String input = "12:01:00PM";

        System.out.println("Output:" +tc.solution(input));

        System.out.println("Output:" +tc.solution("12:31:50AM"));

    }

    public String solution(String s) {
        System.out.println("Input: " + s);
        //3. if AM & 12hr then update time string
        String amPm = s.substring(8);
        System.out.println(amPm);
        boolean isPM = amPm.equalsIgnoreCase("PM");

        String hrs = s.substring(0,2);
        System.out.println(hrs);


        StringBuilder result = null;
        if(isPM) {
            if(hrs.equalsIgnoreCase("12")){
                return s.substring(0,8);
            }
            else {
                result = new StringBuilder();
                int hr = Integer.valueOf(hrs) + 12;
                return result.append(String.valueOf(hr)).append(s.substring(2,8)).toString();
            }
        }
        else {
            if(hrs.equalsIgnoreCase("12")){
                result = new StringBuilder();
                String  remainingPart = s.substring(2,8).toString();
                System.out.println("remaing part:" + remainingPart);
                return result.append("00").append(remainingPart).toString();
            }
            else
            {
                return s.substring(0,8);
            }

        }
    }
}
