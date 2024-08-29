package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void main(String[] args) {

     FamilyNameAdder<String, List<String>, List<String>> myProcess = (familyName, familyList, result) -> {
           for(String name : familyList){
               result.add(name + " "+familyName);
           }
           return  result;

        };

     List<String> family = Arrays.asList("manoher","latha","charvi","jassvik");
     String familyName = "Ginnu";
     ArrayList<String> result = new ArrayList();
       List<String> processData = myProcess.myProcessFamilyData(familyName,family,result);


        processData.stream().forEach(System.out::println);



    }
}