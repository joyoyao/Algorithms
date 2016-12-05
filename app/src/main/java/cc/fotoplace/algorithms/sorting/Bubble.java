package cc.fotoplace.algorithms.sorting;

import cc.fotoplace.algorithms.utils.std;

/**
 * Bubble_Sort 冒泡排序
 * 时间复杂度：O(n^2)
 *
 *【思路】
 *	共遍历n次数组A[]，（i=[0,n-1]）
 *	每次比较 A[j]和A[j+1], 每遍历一次选出一个最大值 放在数组A[]的倒数第i个位置上
 *	【
 *		j的范围可以优化 、 [0,n-1-i]
 *	】
 *
 * Created by nibnait on 2016/9/23.
 */
public class Bubble {


    public static void main(String[] args) {
        int[] A = new int[]{54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        int[] B = new int[13];

        A = Bubble_Sort(A);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

    private static int[] Bubble_Sort(int[] a) {
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
