package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        ArrayList<Integer> result =new ArrayList<>();
        for(int grade:grades){
            if(grade>=38 && grade%5>=3){
                grade+=5-grade%5;
                result.add(grade);
            }
            else result.add(grade);
        }
        return result;

    }
}
