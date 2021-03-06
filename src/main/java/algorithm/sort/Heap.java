package algorithm.sort;

/**
 * 堆排序
 */
public class Heap {
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};

        System.out.print("排序前:  ");
        print(arr);

        heapSort(arr);

        System.out.print("排序后:  ");
        print(arr);
    }

    //排序
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        // 建堆。
        buildHeap(arr);

        int len = arr.length;
        while (len > 1) {
            // 把堆顶和最后一个元素交换。
            swap(arr, 0, len - 1);
            // 交换完之后，逻辑上去掉最后一个元素。
            len--;
            // 重新调整堆的顺序。
            heapFy(arr, 0 , len);

            // 把每一趟排序的结果也输出一下。
            print(arr);
        }
    }

    //第一次建堆
    private static void buildHeap(int[] arr) {
        // 最后一个非叶子结点：2i + 1 >= arr.length  -->  i >= (arr.length - 1) / 2
        for (int i = (arr.length - 1) / 2 - 1; i >= 0; i--) {
            heapFy(arr, i, arr.length);
        }
    }

    //调整堆的顺序，保持大顶堆。
    private static void heapFy(int[] arr, int i, int len) {
        while (true) {
            int maxPostion = i;
            int leftChild = 2 * i + 1;  // 左孩子索引。
            int rightChild = 2 * i + 2; // 右孩子索引。

            // 若左孩子大于最大值，则更新最大值。
            if (leftChild < len && arr[leftChild] > arr[maxPostion]) {
                maxPostion = leftChild;
            }

            // 若右孩子大于最大值，则更新最大值。
            if (rightChild < len && arr[rightChild] > arr[maxPostion]) {
                maxPostion = rightChild;
            }

            if (maxPostion == i) {
                break;  // 若已经是大顶堆了，则退出循环。
            } else {
                swap(arr, i, maxPostion);   // 若不是大顶堆，则交换位置。
                i = maxPostion;
            }
        }
    }

    //交换位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    // 打印数组
    public static void print(int[] arr) {
        if (arr == null)    return;

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
排序前:  6 9 1 4 5 8 7 0 2 3
8 6 7 4 5 1 3 0 2 9
7 6 3 4 5 1 2 0 8 9
6 5 3 4 0 1 2 7 8 9
5 4 3 2 0 1 6 7 8 9
4 2 3 1 0 5 6 7 8 9
3 2 0 1 4 5 6 7 8 9
2 1 0 3 4 5 6 7 8 9
1 0 2 3 4 5 6 7 8 9
0 1 2 3 4 5 6 7 8 9
排序后:  0 1 2 3 4 5 6 7 8 9
*/
