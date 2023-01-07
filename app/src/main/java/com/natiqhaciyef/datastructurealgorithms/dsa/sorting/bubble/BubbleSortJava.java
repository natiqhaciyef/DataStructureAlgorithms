package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.bubble;

import java.util.ArrayList;

public class BubbleSortJava {
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
        return arr;
    }
}