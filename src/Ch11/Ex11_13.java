package Ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i=0; set.size()<6; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
        // TreeSet은 저장할 때 이미 정렬하기 때문에 읽어올 때 바로 정렬할 필요 없어서
        // Collections.sort(list); 이런식으로 정렬 안해도됨.
    }
}
