package second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; i < n; i++) {
                if (lists.get(i)>3*lists.get(j)) {

                }
            }
        }
        
    }
}
