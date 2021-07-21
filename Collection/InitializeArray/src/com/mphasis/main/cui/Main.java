package com.mphasis.main.cui;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Allocate and initialize array.
        int array[] = new int[10];
        for(int index = 0; index < 10; index++)
            array[index] = -3 * index;

        // Display, sort, and display the array.
        System.out.print("Original contents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        // Fill and display the array.
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        display(array);

        // Sort and display the array.
        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);

        // Binary search for -9.
        System.out.print("The value -9 is at location ");
        int index =
                Arrays.binarySearch(array, -9);

        System.out.println(index);
    }
    static void display(int array[]) {
        for(int value: array)
            System.out.print(value + " ");

        System.out.println();
    }



}
