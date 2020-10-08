package algorithm.sort;

/**
 * 选择排序:每次找出最小的值放在前面
 * 第i次循环，找到剩余元素最小的值和第i的位置的元素进行交换
 */
public class Choose {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2, 1, };
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++)   //这里因为最后一个数不需要比较了
        {
            int min = i;         //设定每次循环的第一个值为最小值
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j]<arr[min])
                    min = j;
            }
            if (min!=i)
            {
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
