package com.test;

public class SockMerchant {
    public static void main(String[] args) {
        int[] ar = {4,5,5,5,6,6,4,1,4,4,3,6,6,3,6,1,4,5,5,5};
        int result = sockMerchant(ar);
        System.out.println(result);
    }

    private static int sockMerchant(int[] ar) {
        int pairs = 0;
        boolean loop = true;
        for(int i=0;i<ar.length;) {
            loop = true;
            for(int j=i+1;j<ar.length;j++) {
                if(ar[i] == ar[j]) {
                    int temp = ar[i + 1];
                    ar[i + 1] = ar[j];
                    ar[j] = temp;
                    i = i+2;
                    pairs++;
                    loop = false;
                    break;
                }
            }
            if (loop) {
                i++;
            }
        }
        return pairs;
    }

}
