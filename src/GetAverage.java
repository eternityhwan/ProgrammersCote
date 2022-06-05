public class GetAverage {
        public double solution() {
            int[] arr = {5,5};
            // 정수를 담고있는 배열 arr의 평균을 값을 리턴하라
            double answer = 0;
            for (int i = 0; i < arr.length; i++) {
                answer += arr[i];
            }
            return answer/(double)arr.length;
            // 배열의 길이만큼의 숫자로 나눠야해.
        }

    public static void main(String[] args) {
        GetAverage getAverage = new GetAverage();
        System.out.println(getAverage.solution());
    }
}
