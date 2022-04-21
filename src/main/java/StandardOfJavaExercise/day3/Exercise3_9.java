package StandardOfJavaExercise.day3;

class Exercise3_9 {
    public static void main(String[] args) {

        String exam = "z";
        String b = "[a-zA-Z0-9]";

        if (exam.matches(b)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}