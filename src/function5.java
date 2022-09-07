import java.util.Scanner;

public class function5 {
    public static void table(int n){
        for (int i =1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
}
