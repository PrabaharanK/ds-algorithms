package com.test;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3,7, 8, 11};
        int[] arr2 = {2, 5, 7, 7,19};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        for (; i < arr1.length && j < arr2.length; ) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
            System.out.println("array1");
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
            System.out.println("array2");
        }

        for (int a : arr3) {
            System.out.println(a);
        }
    }


}

