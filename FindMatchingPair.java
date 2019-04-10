package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindMatchingPair {
    public static void main(String[] args) {
        int[] A = {8, 2, 3, 1, 5, 4, 7, 6, 8};
        int sum =10;
        //findPair(A,sum);
        //findProductPair(A,12);
        //findPairUsingHashing(A, 10);
        findProductPairUsingHashing(A, 12);
    }

    public static void findPair(int[] A, int sum) {
        Arrays.sort(A);
        int low = 0, high = A.length - 1;
        while (low < A.length-1) {
            while (low < high) {
                if (A[low] + A[high] == sum) {
                    System.out.println("Pairs " + A[low] + " " + A[high]);
                    break;
                }
                if (A[low] + A[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
            low++;
        }
    }


    public static void findProductPairUsingHashing(int[] A, int sum) {

        Map<Integer, Integer> hashmap = new HashMap<>();


        for (int i = 0; i < A.length - 1; i++) {
            if (sum%A[i] ==0 && hashmap.containsKey(sum / A[i])) {
                System.out.println("Pair found " + hashmap.get(sum / A[i]) + " " + A[i]);
                break;
            }
            if (sum % A[i] == 0) {
                hashmap.put(A[i], A[i]);
            }
        }
    }


    public static void findPairUsingHashing(int[] A, int sum) {

        Map<Integer, Integer> hashmap = new HashMap<>();


        for (int i = 0; i < A.length - 1; i++) {
            if (hashmap.containsKey(sum - A[i])) {
                System.out.println("Pair found " + hashmap.get(sum - A[i]) + " " + A[i]);
                break;
            }
            hashmap.put(A[i], A[i]);
        }
    }

    public static void findProductPair(int[] A, int sum) {
        Arrays.sort(A);
        Set<Integer> elements = new HashSet<>();
        int low = 0, high = A.length - 1;
        while (low < A.length - 1) {


            while (low < high) {
                if (A[low] * A[high] == sum) {
                    System.out.println("Pairs " + A[low] + " " + A[high]);
                    break;
                }
                if (A[low] * A[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
            low++;
        }



    }
}
