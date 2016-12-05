package cc.fotoplace.algorithms;

import cc.fotoplace.algorithms.utils.std;

/**
 * Created by laputan on 16/12/5.
 */

public class bubble {


    public static void main(String[] args) {
        int[] A = new int[]{54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        int[] B = new int[13];

        A = Bubble_Sort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

    private static int[] Bubble_Sort(int[] a) {

        int tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    std.swap(a, j, j+1);
                }
            }
        }
        return a;
    }
}
