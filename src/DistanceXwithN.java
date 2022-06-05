import java.util.Arrays;
public class DistanceXwithN {
    public long[] solution() {
        int x = 2; // 공차
        int n = 5; // 배열의 길이
            long[] answer = new long[n];
            for (int i = 0; i < n; i++) {
                answer[i] = (long)x * (i+1);
                // i + 1은 i가 0부터 시작하는데 0값은 필요 없다.
                // 1값부터 2를 곱해서 출력하라는 뜻이다.
                // 원래는 0 1 2 3 4 이렇게 나오는데
                // 0부터 나오게되면 0 2 4 6 8 이렇게 나오겠지
                // but i + 1 을 넣어주게 되면
                // 2 4 6 8 10 이렇게 나오게 될 것이다.
            }
            return answer;
        }
    public static void main(String[] args) {
        DistanceXwithN betweenxn = new DistanceXwithN();
        System.out.println(Arrays.toString(betweenxn.solution()));
    }
}


