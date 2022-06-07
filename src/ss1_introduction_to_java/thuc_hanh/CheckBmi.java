package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class CheckBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;
        System.out.println("Enter weight (kg)");
        weight = scanner.nextDouble();

        System.out.println("Enter height (met)");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        if (bmi < 18.5){
            System.out.println("your bmi = " + bmi + " = Underweight");
        }else if (bmi < 25.0){
            System.out.println("your bmi = "  + bmi + " = Normal");
        }else if (bmi < 30.0){
            System.out.println("your bmi = "  + bmi + " = Overwweight");
        }else {
            System.out.println("your bmi = "  + bmi + " = Obese");
        }
    }
}
