public class CodingTest2 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다"; // 은 뒤 띄어쓰기
                break;
            }
        }
        return answer;
    }
}
// CodingTest2 중괄호 안닫아서 실패함(런타임에러)
//    public static void main(String[] args) {
//        // 스트링 배열을 선언, 헬로우랑 월드가 들어있는 스트링 배열 선언하기
//        String[] helloworld = {"hello", "world"};
//        // 선언한 배열을 solution이라는 메소드에 넘긴다.
//        new CodingTest2().solution(helloworld);
//        System.out.println(helloworld[0]);
//        System.out.println(helloworld[1]);

//    }
//}
