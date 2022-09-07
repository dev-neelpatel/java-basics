import java.util.Scanner;

public class function4 {
    public static void isEven(int n){
        if (n%2==0){
            System.out.println("It is an Even Number");
        }else {
            System.out.println("It is Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEven(n);
    }
}
