import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
//      Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the diameter of the circle");
        int d = sc.nextInt();
        int r = d/2;
        float pi = 3.14f;
        double area = pi*r*r;
        System.out.println("Area of circle having radius "+r+" is "+area);
    }
}
