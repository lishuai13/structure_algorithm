package third;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lists.add(i+1);
        }
        int position=0;
        int value=1;
        while (lists.size()!=1){
            while (position!=lists.size()-1){
               if (value==m){
                   System.out.println("p:"+position+",v:"+value+",loc:"+lists.get(position));
                   lists.remove(position);
                   position++;
                   value=1;
               }
               else {
                   System.out.println("p:"+position+",v:"+value+",loc:"+lists.get(position));
                   position++;
                   value++;
               }
            }
            while (position!=0){
                if (value==m){
                    System.out.println("p:"+position+",v:"+value+",loc:"+lists.get(position));
                    lists.remove(position--);
                    value=1;
                }
                else {
                    System.out.println("p:"+position+",v:"+value+",loc:"+lists.get(position));
                    value++;
                    position--;
                }
            }
        }
        System.out.println(lists.get(0));
    }
}
