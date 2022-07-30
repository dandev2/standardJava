package Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P416 {
    public static void main(String[] args) {
//        String[][] str2D = new String[][]{{"aaa","bbb"}, {"AAA", "BBB"}};
//        String[][] str2D2 = new String[][]{{"aaa","bbb"}, {"AAA", "BBB"}};
//
//        System.out.println(Arrays.equals(str2D, str2D2)); // false
//        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        /*
        false 나오는 이유
        '배열의 값'이 아닌 '배열의 주소'를 저장하기 때문
        서로 다른 배열(객체)는 항상 주소가 다르므로 false 리턴!!
         */

        List list = Arrays.asList(new Integer[]{1,2,3,4,5}); // list = [1,2,3,4,5]
        List list2 = Arrays.asList(1,2,3,4,5);
        list2.add(6); // UnsupportedOperationException 예외 발생
        /*
        예외 발생 이유
        asList()가 반환한 List의 크기를 변경할 수 업음.
        추가, 삭제 불가
        크기 변경이 불가하므로 저장된 값은 변경 가능
        크기 변경 가능한 List로 작성하고 싶으면 다음과 같이 하자.
        List list = new ArrayList(Arrays.asList(1,2,3,4,5));
         */
    }
}
