import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        double num1;
        double num2;
        System.out.println("Enter first operand: "); //
        num1 = scnr.nextDouble();
        System.out.println("Enter second operand: ");
        num2 = scnr.nextDouble();

        System.out.println("Calculator Menu\n---------------");
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        System.out.println("Which operation do you want to perform?");
        int choice;
        choice = scnr.nextInt();
        String result = "The result of the operation is ";
        // evaluates the input of the user and performs a specified operation
        if(choice == 1){
            System.out.print(result);
            System.out.print(num1 + num2);
            System.out.print(".");
            System.out.print(" Goodbye!");
        }
        else if(choice == 2){
            System.out.print(result);
            System.out.print(num1 - num2);
            System.out.print(".");
            System.out.print(" Goodbye!");
        }
        else if(choice == 3){
            System.out.print(result);
            System.out.print(num1 * num2);
            System.out.print(".");
            System.out.print(" Goodbye!");
        }
        else if(choice == 4){
            System.out.print(result);
            System.out.print(num1 / num2);
            System.out.print(".");
            System.out.print(" Goodbye!");
        }
        else{
            System.out.print("Error: Invalid selection! Terminating program. ");
        }

    }

}
