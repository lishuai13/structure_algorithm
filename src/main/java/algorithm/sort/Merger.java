package algorithm.sort;

/**
 * 归并排序
 */
public class Merger {

    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12}; //数组是对象
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergerSort(arr,0,arr.length-1,tmp);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    //将有二个有序数列a[first...mid]和a[mid...last]合并。
    static void mergerArray(int[] a, int first, int mid, int last, int[] temp)
    {
        int i = first, j = mid + 1;
        int k = 0;

        while (i <= mid && j <= last)
        {
            if (a[i] <= a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }

        while (i <= mid)
            temp[k++] = a[i++];

        while (j <= last)
            temp[k++] = a[j++];

        for (i = 0; i < k; i++)
            a[first + i] = temp[i];
    }

    static void mergerSort(int[] a, int first, int last, int[] temp)
    {
        if (first < last)
        {
            int mid = (first + last) / 2;
            mergerSort(a, first, mid, temp);    //对左边进行拆分
            mergerSort(a, mid + 1, last, temp); //对右边进行拆分
            mergerArray(a, first, mid, last, temp); //再将二个有序数列合并
        }
    }
}
