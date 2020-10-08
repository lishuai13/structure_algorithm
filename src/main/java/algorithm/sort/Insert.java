package algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author lishuai
 */
public class Insert {
    public static void main(String[] args) {
        Integer[] array = {2, 4, 5, 6, 2, 1,};
        int i,j,temp;

        for(i=1;i<array.length;i++) {
            //temp表示第一个无序元素，默认从第二个元素开始
            temp=array[i];
            for(j=i-1;j>=0;j--) {
                //将第一个无序元素依次从后向前与有序元素比较
                if(temp>array[j]) {
                    break;
                }
                //如果有序元素元素比第一个无序元素大，就将这个有序元素右移一位
                else {
                    array[j+1]=array[j];
                }
            }
            //循环结束，将第一个无序元素放入空出来的位置
            array[j+1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
