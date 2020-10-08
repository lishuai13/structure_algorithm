package algorithm.search;

/**
 * 插值查找，类似于二分查找，只是对middle进行了优化，不再固定时1/2
 */
public class InterpolationSearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int i = interpolationSearch(a, 4);
        System.out.println(i);
    }

    public static int interpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + ((value - array[low]) / (array[high] - array[low])) * (high - low);
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
