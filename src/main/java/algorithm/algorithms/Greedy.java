package algorithm.algorithms;

/**
 * 贪心算法
 */
public class Greedy {
    static int[] value = {1,5,10,20,50,100};
    static int[] number={5,2,2,3,3,5};

    public static void main(String[] args) {

        int money = 625;
        int result = solve(money);
        if (result==-1)
            System.out.println("钱不够");
        else {
            System.out.println("至少需要"+result+"张纸币");
        }
    }

    private static int solve(int money){
        int num=0;
        for (int i = value.length-1; i >= 0; i--) {
            int c = Math.min(money/value[i],number[i]);
            money-=c*value[i];
            System.out.println(money);
            num+=c;
        }
        //钱不够
        if (money>0)
            return -1;
        return num;
    }
}
