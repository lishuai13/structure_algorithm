package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 冒泡排序，循环比较每个数据，比较相邻的元素，大的放到后面，或者小的放在前面
 */
public class Bubbling {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        int[] arr = {2, 4, 5, 6, 2, 1, };
        int temp;
        //外层循环控制排序趟数，若为6个数，则需要排5次
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每一趟排序多少次，第一趟5次。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
