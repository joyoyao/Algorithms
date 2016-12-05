package cc.fotoplace.algorithms.standard;

/**
 * Created by laputan on 16/12/5.
 */

public class BinarySearch {

    /**
     * 二分查找
     *
     * @param arr
     * @param num
     * @return
     */
    public static int search(int[] arr, int num) {


        int low = 0;
        int height = arr.length - 1;
        int mid = 0;
        int res = -1;
        while (low < height) {
            mid = (low + height) >> 1;
            if (arr[mid] >= num) {
                res = mid;
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return res;
    }
}
