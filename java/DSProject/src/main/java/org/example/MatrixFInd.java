package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixFInd {

    public static void main(String[] args) {
        int[][] myMatrix = {{2, 9, 1}, {3, 0, 4}, {5, 6, 0}};

        List<Integer> myfaltnUmbers = Arrays.stream(myMatrix).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());

        int maxNumber = myfaltnUmbers.stream().filter(n -> n != 0).max(Integer::compare).orElse(0);

        Set<Integer> expectedNumbers =
                IntStream.range(1, maxNumber).boxed().collect(Collectors.toSet());


        myfaltnUmbers.stream()
                .filter(num -> num != 0)
                .forEach(expectedNumbers::remove);

        Iterator<Integer> missingNumbersIterator = expectedNumbers.iterator();

        for(int i=0;i<myMatrix.length-1;i++){
            for(int j=0;j<=myMatrix[i].length-1;j++){
                if(myMatrix[i][j] == 0 && missingNumbersIterator.hasNext()){
                     myMatrix[i][j] =missingNumbersIterator.next();
                }
            }
        }

        for(int i=0;i<myMatrix.length;i++){
            for(int j=0;j<myMatrix[i].length;j++){
                if(myMatrix[i][j] == 0 && missingNumbersIterator.hasNext()){
                   System.out.print(myMatrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


}
