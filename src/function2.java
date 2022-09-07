import java.util.Scanner;

public class function2 {
    public static void printFactorial(int a){
        if (a<0){
            System.out.println("Invalid Number");
            return;
        }
        int fact = 1;
        for (int i=a;i>=1;i--){
            fact *= i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);
    }
}
