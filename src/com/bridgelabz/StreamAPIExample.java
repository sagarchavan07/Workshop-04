package com.bridgelabz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(45, 60, 5, 10, 80, 13, 72, 5, 60);
        System.out.println(list1);

        System.out.println("square using map: ");
        List<Integer> list1Square = list1.stream().map((x) -> x * x).collect(Collectors.toList());
        System.out.println(list1Square);

        System.out.println("even numbers using filter: ");
        List<Integer> list1EvenNumbers = list1.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(list1EvenNumbers);

        System.out.println("Sorted list: ");
        List<Integer> list1Sorted = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(list1Sorted);

        System.out.println("sum using reduce: ");
        Integer sum = list1.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("anyMatch prime number: ");
        boolean anyPrimeMatch = list1.stream().anyMatch(x -> StreamAPIExample.checkPrime(x));
        System.out.println(anyPrimeMatch);

        System.out.println("allMatch even number: ");
        boolean allEvenMatch = list1.stream().allMatch(x -> x % 2 != 0);
        System.out.println(allEvenMatch);

        System.out.println("unique elements of list1");
        List<Integer> list1Distinct = list1.stream().distinct().collect(Collectors.toList());
        System.out.println(list1Distinct);
    }

    static boolean checkPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
