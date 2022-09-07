import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.println("Input marks");
            int i = sc.nextInt();
            if (i<=100 && i>=90){
                System.out.println("Great");
            } else if (89>=i && i>=60) {
                System.out.println("Nice");
            } else if (59>=i&&i>=33) {
                System.out.println("Work Hard");
            }else {
                System.out.println("We are sorry to say you didn't pass the exam");
            }
            System.out.println("Press 0 to exit & press 1 to add marks");
            j = sc.nextInt();
        } while (j == 1);
    }
}
