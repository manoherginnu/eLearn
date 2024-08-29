package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        int[] n = {1,3,19};
        int[] m = {2,4,8,10};

        int leng = n.length+m.length;
        int[] result =  new int[leng];
       int  index = 0;
       int np = 0;
       int mp =0;
        while(index < leng){
        try {
            if (n[np] > m[mp]) {
                result[index] = m[mp];
                mp++;
            } else {
                result[index] = n[np];
                np++;
            }
        }catch (Exception e){
            if(n.length-1 >= np){
                result[index] = n[np];
            }
            if(m.length-1 >=mp){
                result[index] = m[mp];
            }
        }

            index++;
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
