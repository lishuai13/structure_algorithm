package algorithm.algorithms;

/**
 * 回溯法解决八皇后问题
 */
public class EightQueen {
    //定义皇后的个数,当然也是行数，列数
    static int queenNum = 8;
    //第i个皇后在第i行的位置为第Queen[i]列
    static int[] Queen = new int[queenNum];
    //最后满足条件的次数
    static int count = 0;
    //放置第n行皇后
    public static void NQueen(int n) {
        //当行数等于8时，说明8个皇后都摆放好了，输出
        if (n==queenNum){
            count++;
            for (int i : Queen) {
                System.out.print(i+" ");
            }
            System.out.println();
        }else {
            //寻找第n个皇后放置的列
            for (int col = 0; col < queenNum; col++) {
                //皇后的位置进行赋值
                Queen[n]=col;
                //判断第n个皇后放置之后形成的位置数组能够满足条件
                if(judge(n)){
                    //如果可以就开始放置下一个皇后
                    NQueen(n+1);
                }
                //如果不满足，就无法进入下一层，继续将这层的位置改变
            }
            //当循环结束还没有满足条件，这条路就会断掉，相当于回到了上一个皇后的放置，就是回溯
        }
    }
    //写一个判断是否可放置的函数
    public static boolean judge(int n)//判断（n,Queen(n)）能否放置皇后* n为第几行
    {
        //循环要进行完因为要进行所有上满的列和所有上面的的对角线进行对比
        for (int j = 0; j <n ; j++) {
            //首先判断同列，再判断对角线 ，同行不用判断因为是逐行放的没行只放一个
            if(Queen[j]==Queen[n]||Math.abs(Queen[j]-Queen[n])==n-j){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        NQueen(0);
        System.out.print("共有"+count+"种方式");
    }
}