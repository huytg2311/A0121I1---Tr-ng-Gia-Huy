import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter Your Weight: ");
        weight = sc.nextDouble();
        System.out.println("Enter your Height: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "BMI", "Interpretation\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "UnderWeight");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }   else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20s%s", bmi, "Obese");
        }
    }
}
