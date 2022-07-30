package Ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator사용이유 {
    public static void main(String[] args) {
        HashSet list = new HashSet()    ; // Set은 Collection의 자손
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

//        // for문으로 변경
//        for(int i=0; i<list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}

