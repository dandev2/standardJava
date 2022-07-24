package Ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // index 1~3 출력
        print(list1, list2);

        // 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스 3인 곳에 "A" 추가
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list.retainAll(list2):" + list1.retainAll(list2));;
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i= list1.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i))) {
                list2.remove(i); // 인덱스가 i인 곳에 저장된 요소 삭제
            }
        }
        print(list1, list2);
     } // main 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
}// class

/*
출력결과
list1:[5, 4, 2, 0, 1, 3]
list2:[4, 2, 0]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4]

list1.containsAll(list2):true
list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, A, B, C]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, AA, B, C]

list.retainAll(list2):true <- retainAll에 의해 list1에 변화가 있었으므로 true 반환
list1:[0, 2, 4] <- list2와의 공통요소 이외에는 모두 삭제됨.(변화 o)
list2:[0, 2, 4, AA, B, C]

list1:[0, 2, 4]
list2:[AA, B, C]


Process finished with exit code 0

 */
