package Ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for(int i=0; i<objArr.length; i++) {
            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장
        }
        // HashSet에 저장된 요소 출력
        System.out.println(set);

        // HastSet에 저장된 요소 출력(Iterator이용)
        Iterator it = set.iterator();
        while(it.hasNext()) { // 얻어올 요소 있는지 확인
            System.out.println(it.next()); // 요소 하나 꺼내오기
        }
    }
}
