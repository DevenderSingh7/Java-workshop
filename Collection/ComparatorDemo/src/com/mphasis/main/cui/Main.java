package com.mphasis.main.cui;

import java.util.Comparator;
import java.util.TreeSet;

// A reverse comparator for strings.
class MyComp implements Comparator<String> {
    public int compare(String str1, String str2) {
        String aStr, bStr;

        aStr = str1;
        bStr = str2;

        // Reverse the comparison.
        return bStr.compareTo(aStr);
    }

    // No need to override equals.
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create a tree set.
        TreeSet<String> stringTreeSet = new TreeSet<String>(new MyComp());

        // Add elements to the tree set.
        stringTreeSet.add("C");
        stringTreeSet.add("A");
        stringTreeSet.add("B");
        stringTreeSet.add("E");
        stringTreeSet.add("F");
        stringTreeSet.add("D");

        // Display the elements.
        for(String element : stringTreeSet)
            System.out.print(element + " ");

        System.out.println();
    }
}


