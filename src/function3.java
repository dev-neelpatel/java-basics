import java.util.Scanner;

public class function3 {
    public static void isPrime(int n){
        boolean isPrime1 = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                isPrime1 = false;
                break;
            }
        }
        if(isPrime1) {
            if(n == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("This is a prime number");
            }
        } else {
            System.out.println("This is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}
