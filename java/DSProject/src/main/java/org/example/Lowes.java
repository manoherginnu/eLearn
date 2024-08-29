package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Lowes {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple","taj","vowels","jaguar","starbugs","star");

        //filter with start with s
        //sort on desc
        //convert capital

        List<String> myreuslt = list.stream().filter(word -> word.startsWith("s"))
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(myreuslt);

        List<Integer> list1 = Arrays.asList(1,3,8,9);
        List<Integer> list2 = Arrays.asList(2,4,7,10);

        int[] result = new int[list1.size()+list2.size()];
        int len = list1.size() + list2.size();
        int index = 0;
        int ele = 1;
        while(index < len){
            if(list1.contains(ele)){
                result[index++] = ele++;
            } else if(list2.contains(ele) ){
                result[index++] = ele++;
            }if(!(list1.contains(ele) || list2.contains(ele))){
                ele++;
            }
        }
        Arrays.stream(result).forEach(System.out::println);

    }
}
