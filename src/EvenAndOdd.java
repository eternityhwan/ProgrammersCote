public class EvenAndOdd {
    public String solution() {
        int num = 4;
        String answer = "";

        if (num % 2 == 1 || num == 0) {
            System.out.println("\"Odd\"");
        } else
            System.out.println("\"Even\"");
        return answer;
    }

    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        System.out.println(evenAndOdd.solution());
    }
}
