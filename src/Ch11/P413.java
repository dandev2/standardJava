package Ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P413 {
    public static void main(String[] args) {
        List list = new ArrayList(); // 다른 컬렉션으로 변경할 때는 이 부분만 변경하면 됨. (재사용성)
        Iterator it = list.iterator();

        while(it.hasNext()) { // boolean hasNex()로 읽어올 요소가 있는지 확인
            System.out.println(it.next()); // Object next() 다음 요소를 읽어옴.
        }

    }
}