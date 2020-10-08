package algorithm.search;

/**
 * 顺序查找
 */
public class SequentialSearch {
    public static void main(String[] args) {
        int[] a = {1,3,12,4,2,33,11,44,31};
        int i = sequentialSearch(a, 31);
        System.out.println(i);
    }

    //正常的查找每次都需要比较i是否越界
    static int Search(int[] a,int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==key){
                return i;
            }
        }
        //return -1 说明查找失败
        return -1;
    }

    //带哨兵的顺序查找，不需要比较i是否越界
    public static int sequentialSearch(int[] a, int key) {
        int index = a.length - 1;
        //先判断最后一个元素是不是要找的元素
        if (key == a[index])
            return index;
        //不是就让最后一个元素当作哨兵
        a[index] = key;
        int i = 0;
        while (a[i] != key){
            i++;
        }
        //这里如果查到最后一个元素，说明未找到，返回-1
        return i == index ? -1 : i;
    }
}
