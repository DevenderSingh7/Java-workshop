package com.mphasis.main.cui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
       List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

     //1  //numbers.stream().forEach(System.out::println);

        //2
//       numbers.stream()
//               .map(number -> number+1)
//               .forEach(System.out::println);

        //3
//        numbers.stream()
//                .map(String::valueOf)
//                .map(num ->Integer.valueOf(num)*2)
//                .forEach(System.out::println);


        //4

//
//        System.out.println(numbers.stream()
//                .map(String::valueOf)
//                .reduce("",(constring,str)->constring.concat(str)));
//
//        System.out.println(numbers.stream()
//                .reduce(0,(total,num)->Integer.sum(total,num)));


        //5

//        System.out.println(numbers.stream()
//                .filter(num ->num%2==0)
//                .map(num->num*2)
//                .reduce(0,(total,num)->Integer.sum(total,num)));


        //6

//        List<Integer> doubleOfEven = new ArrayList<Integer>();
//
//        numbers.stream()
//                .filter(num ->num%2==0)
//                .map(num->num*2)
//                .forEach(num-> doubleOfEven.add(num));
//
//        doubleOfEven.forEach(System.out::println);

        //7
//        List<Integer> doubleOfEven;
//
//       doubleOfEven= numbers.stream()
//                .filter(num ->num%2==0)
//                .map(num->num*2)
//                .collect(Collectors.toList());
//
//        doubleOfEven.forEach(System.out::println);

        Set<Integer> doubleOfEven;

        doubleOfEven= numbers.stream()
                .filter(num ->num%2==0)
                .map(num->num*2)
                .collect(Collectors.toSet());

        doubleOfEven.forEach(System.out::println);




    }
}
