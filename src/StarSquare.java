public class StarSquare {

    public int solution() {
        int a = 5;
        int b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
            break;
        }
        return solution();
    }
        public static void main(String[] args) {
            StarSquare starSquare = new StarSquare();
            System.out.println(starSquare.solution());
    }
}

