package StandardOfJavaExercise.day4;



public class Exercise4_3 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i-(i-1); j++) {
                sum += i;
                sum2 += sum;

                System.out.print(sum+""+"+");
            }
        }
        System.out.println("= "+ sum2);
    }
}

