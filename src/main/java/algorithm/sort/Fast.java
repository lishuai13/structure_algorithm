package algorithm.sort;

/**
 * 快速排序：通过一次排序将数组分成连个部分，后面的部分比前面的部分大
 * 需要一个轴，第一次是第一个元素
 */
public class Fast {
    public static void main(String[] args) {

        Integer[] arr = {2, 4, 5, 6, 2, 1,};
        FastSort(arr,0,arr.length-1);
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }

    private static void FastSort(Integer[] arr, int low, int high){
        if (low < high)
        {
            int i, j, x;
            i = low;    //首
            j = high;   //尾
            x = arr[i]; //轴
            while (i < j)
            {
                while (i < j && arr[j] > x)
                    j--; // 从右向左找第一个小于等于x的数
                if (i < j)
                    arr[i++] = arr[j];  //找到之后赋值,i++
                while (i < j && arr[i] < x)
                    i++; // 从左向右找第一个大于等于x的数
                if (i < j)
                    arr[j--] = arr[i];  //找到之后交换赋值，j--
            }
            arr[i] = x; //最后退出循环，i=j，也是中间值，轴

            FastSort(arr, low, i - 1); /* 递归调用 */
            FastSort(arr, i + 1, high); /* 递归调用 */
        }
    }
}
