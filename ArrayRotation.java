package com.test;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,6,7};
        // by Simple Array Rotation
        // int[] arr2 = rotateLeftByOne(arr1, 5);
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/

        //Juggling algorithm

        int[] arr2 = juggling(arr1, 7, 2);
//        for (int a : arr2) {
//            System.out.println(a);
//        }



    }

    static int[] rotateLeftByOne(int[] arr1, int rotateSize) {
        int temp = arr1[0];
        for (int i = 0; i < arr1.length-1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = temp;
        if (--rotateSize > 0) {
            rotateLeftByOne(arr1, rotateSize);
        }

        return arr1;
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static int[] juggling(int[] arr1, int n, int d) {
        int i,j,k,temp;
        int count = 0;
        for (i = 0; i < gcd(n, d); i++) {
            temp = arr1[i];
            j =i;
            while (true) {
                k = j+d;
                if (k >= n) {
                    k = k-n;
                }
                if (k == i) {
                    break;
                }
                arr1[j] = arr1[k];
                j= k;
                count++;
            }
            arr1[j] = temp;
            System.out.println();
            for (int a : arr1) {
                System.out.print(a);
            }
        }
        System.out.println("Overall count"+count);
        return arr1;
    }
}
