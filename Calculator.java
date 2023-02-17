import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        float num1, num2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number : ");
        num1 = sc.nextFloat();
        System.out.print("Enter second number : ");
        num2 = sc.nextFloat();

        System.out.print("You have Entered : ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.println(num2);


        String prompt = "Enter 0 for addition, 1 for subtraction,"+
                        " 2 for multiplication, 3 for division";
        System.out.println(prompt);
        int input = sc.nextInt();

        switch (input){

            case 0:
                System.out.println(num1+num2);
                break;

            case 1:
                System.out.println(num1-num2);
                break;

            case 2:
                System.out.println(num1*num2);
                break;

            case 3:
                System.out.println(num1/num2);
                break;

            default:
                System.out.println("Invalid input");
        }


    }
}
