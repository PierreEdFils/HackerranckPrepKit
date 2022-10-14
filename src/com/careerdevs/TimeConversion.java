package com.careerdevs;

public class TimeConversion  {

        public static String timeConversion(String s) {
            // Write your code here
            String [] str=s.split(":");
            int hour = Integer.parseInt(str[0]);
            int min = Integer.parseInt(str[1]);
            String last = str[str.length-1];
            int seconds = Integer.parseInt(last.substring(0,last.length()/2));
            String amPm =last.substring(last.length()/2, last.length());

            String military = "";
            if (amPm.compareTo("PM")==0){
                military = String.format("%02d:%02d:%02d", (hour+ 12), min,seconds);
                if (hour == 12)
                    military = String.format("%02d:%02d:%02d", hour, min,seconds);
            }
            if (amPm.compareTo("AM")==0){
                military = String.format("%02d:%02d:%02d", ( 12-hour), min,seconds);
                if (hour < 12)
                    military = String.format("%02d:%02d:%02d", hour, min,seconds);
            }
            return military;
        }
    }


