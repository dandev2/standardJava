package Ch11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        HashSet list = new HashSet()    ; // Set은 Collection의 자손
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator는 1회용이라 다 쓰고 나면 다시 얻어와야 한다.
        it = list.iterator(); // 새로운 iterator 객체를 얻는다.

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

//        // for문으로 변경
//        for(int i=0; i<list.size(); i++) {
//            Object obj = list.get(i);
//            System.out.println(obj);
//        }
    }
}
