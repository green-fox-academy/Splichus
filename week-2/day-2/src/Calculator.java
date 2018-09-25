import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an operation in format operation number number");
        String read = scan.nextLine();
        calculate(read.substring(0,1), Integer.parseInt(read.substring(2,3)), Integer.parseInt(read.substring(4,5)));
    }
    public static void calculate (String operation, int num1, int num2) {
        if (operation.equals("+")) {
            System.out.println(num1+num2);
        } else if (operation.equals("-")) {
            System.out.println(num1-num2);
        } else if (operation.equals("*")) {
            System.out.println(num1*num2);
        } else if (operation.equals("/")) {
            System.out.println(num1/num2);
        } else if (operation.equals("%")) {
            System.out.println(num1%num2);
        }
    }
}
