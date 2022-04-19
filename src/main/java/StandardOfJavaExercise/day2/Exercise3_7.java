package StandardOfJavaExercise.day2;

import java.text.DecimalFormat;

class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((5F*(fahrenheit - 32))/9);
        System.out.println(String.format("%.2f",celcius));
//        System.out.println(String.format("%.2f",celcius));

    }
}
