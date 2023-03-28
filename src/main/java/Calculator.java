import java.lang.runtime.ObjectMethods;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int number = scanner.nextInt(), number2, result = 0;
        char symbol;
        System.out.println("Enter second number");
        number2 = scanner.nextInt();
        System.out.println("Enter symbol of operation");
        symbol = scanner.next().charAt(0);
        switch (symbol){
            case '+': result=number + number2;
            break;
            case '-': result=number-number2;
            break;
            case '*': result=number*number2;
            break;
            case '/':
                if (number2==0){
                    System.out.println("You can't divide by zero!");
                    break;
                }
                result=number/number2;
            break;
            case '%': result= number*number2/100;
            break;
            default:
                System.out.println("Error.Try again!");
                System.exit(0);
                break;

        }
        System.out.println(result);
    }

    }

