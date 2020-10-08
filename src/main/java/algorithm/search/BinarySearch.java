package algorithm.search;

/**
 * 二分查找要求数组是有序的
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int i = binarySearch(a, 4);
        System.out.println(i);
    }

    public static int binarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + ((high - low)/2); //而不是(low+high)/2,防止溢出
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                low = middle + 1;
            }
            if (value < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
