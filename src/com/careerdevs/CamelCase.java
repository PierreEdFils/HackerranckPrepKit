package com.careerdevs;

public class CamelCase {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int count =0;
        for (int i = 0; i < s.length();i++) {
        if (Character.isUpperCase(s.charAt(i))) {
            count++;
        }
    }
        System.out.println(count+1);
}
}
