package algorithm.algorithms;

/**
 * 递归算法求阶乘
 */
public class Recursion {
    public static void main(String[] args) {
        int n = 10;
        int result = Factorial(n);
        System.out.println(result);
    }
    private static int Factorial(int n){
        //递归必须有结束条件
        if (n <= 2) {
            return n;
        }
        return n * Factorial(n - 1);
    }
}
