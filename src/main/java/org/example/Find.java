package org.example;

import java.util.List;

public class Find {
    public static Double findMatching(List<Double> list, Double lowerlimit, Double upperlimit){
        for (Double item : list){
            if (item >= lowerlimit && item <= upperlimit){
                return item;
            }
        }
        return null;
    }
}
