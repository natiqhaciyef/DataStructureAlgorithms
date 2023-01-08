package com.natiqhaciyef.datastructurealgorithms.dsa.sorting.selection;

import java.util.ArrayList;

public class SelectionSortJava {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr.get(j) < arr.get(min_idx))
                    min_idx = j;
            int temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }
}
