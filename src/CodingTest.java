public class CodingTest {
    // 두 정수의 합
    public static void main(String[] args) {
        long a = 5;
        long b = 3;
        long smallnumber = (a < b) ? a : b;
        long bignumber = (a <= b) ? b : a;
       // System.out.println(smallnumber);
       // System.out.println(bignumber);
        long answer = 0;
        for (long i = smallnumber; i <= bignumber; i++) {
            answer+=i;
        }
        System.out.println(answer);
    }
}


