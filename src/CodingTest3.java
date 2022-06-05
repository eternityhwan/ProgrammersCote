public class CodingTest3 {
    // 약수의 합 구하기
    // n은 0 이상 3000이하인 정수
    // n = 12, return = 28  (1, 2, 6, 12)
    // n = 5, return = 6 (1 + 2 + 5)
    // 약수 알고리즘을 확인하고 조건값이 때려넣고
    // 출력된 약수를 더해주기만 하면된다.
    // 핵심은 약수 알고리즘을 확인하는 것이다.
    // Math.sqrt() Square root 함수를 쓸 수 있어.
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            // i 를 0으로 해서 실패가 계속 떴다.

            if (n % i == 0) { // 약수 알고리즘
                // n 값이 12라면 28이 나와야하는 것이다.
                answer += i; // <-- 이 방법으로 리턴값에 부여
                System.out.println(i + "n 의 약수");
            }
        }
        return answer;
    }
}

//    public static void main(String[] args) {
//        int x = 12;
//
//
//        }
//    }

