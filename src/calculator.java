import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        //1 : + (Addition) a + b
        //2 : - (Subtraction) a - b
        //3 : * (Multiplication) a * b
        //4 : / (Division) a / b
        //5 : % (Modulo or remainder) a % b
        //Calculate the result according to the operation given and display it to the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Select the operator for the operation:");
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");
        int c = sc.nextInt();
        switch (c){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Incorrect Input");
        }
    }
}
