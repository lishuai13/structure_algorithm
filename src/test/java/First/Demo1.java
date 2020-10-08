package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> lists = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = i; j < str.length(); j++){
                stringBuffer.append(str.charAt(j));
                String s = stringBuffer.toString();
                if (s.contains("110"))
                    break;
            }
            lists.add(stringBuffer.toString()+'\b');
        }
        int max =lists.get(0).length();
        int k = 0 ;
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).length()>max){
                max=lists.get(i).length();
                k=i;
            }
        }
        System.out.println(lists.get(k));
    }
}
