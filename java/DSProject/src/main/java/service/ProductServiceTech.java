package service;

import org.example.Product;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductServiceTech {

    public static void main(String[] args) {
        StreamPractice();
    }
    private static void StreamPractice() {

        List<Product>  pList  = Arrays.asList(
                new Product(1,1,100),
                new Product(2,2,100),
                new Product(3,3,200),
                new Product(4,4,100)
        );

       // List.of("1","2","5","6").forEach();
        List<?> list =Arrays.asList(1,2,3,4,5,6,3);
        Iterator<Integer> it = (Iterator<Integer>) list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value.equals(value))
              //  list.remove(value);
                it.remove();

        }

        list.forEach(System.out::println);
    }

   // int a=10;
  /*      AtomicInteger a = new AtomicInteger(10);
List.of("1","2","5","6").forEach(item->{
        if(item == 5)
            // a=item;
            a.set(5);

    });
    SOP("Value "+a.get() );*/


   /* Optional<Double> max = pList.stream().map(Product::getPrice).max(Comparator.naturalOrder());
System.out.println(max);*/

    }

