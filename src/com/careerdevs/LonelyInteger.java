package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int counter;
        int ni;

        ArrayList<Integer> countedNums = new ArrayList<>();

        for(int i=0; i<a.size(); i++){

            ni = a.get(i);
            counter = 0;

            if(!countedNums.contains(ni)){

                for(int j=a.size()-1; j!=i && counter != 1; j--){

                    if(ni == a.get(j)){
                        counter ++;
                        countedNums.add(ni);
                    }

                }
                if(counter == 0){return ni;}
            }

        }

        return 0;
    }
}
