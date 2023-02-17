import java.util.Scanner;

public class BMICalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your Weight in Kg");
        float weight = sc.nextFloat();
        System.out.println("Your Weight is : "+weight +" Kg");

        System.out.println("Please Enter your Hight in feet");
        float height = sc.nextFloat();

        double new_hight = height * 0.3048;
        System.out.println("Your Height is : "+new_hight +" meter");


        double BMI = weight / (new_hight * new_hight);
        System.out.println("Your BMI is : " + BMI );

        if (BMI < 18.5){
            System.out.print("'Underweight' your BMI is less than 18.5");
        } else if (BMI >= 18.5 && BMI <= 25.0) {
            System.out.print("'Normal weight' your BMI is : " + BMI);
        } else if (BMI >= 25.0 && BMI <= 30.0) {
            System.out.print("'Overweight' Your BMI is : "+ BMI);
        } else{
            System.out.print("'Obesity' your BMI is : " + BMI);
        }
    }
}
