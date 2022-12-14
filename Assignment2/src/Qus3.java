import java.util.Scanner;

public class Qus3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Width in cm: ");
        int width = inp.nextInt();

        System.out.println("Enter the Height in cm: ");
        int height = inp.nextInt();

        int area = width*height;

        System.out.println("The area of the Rectangle is: "+area);

    }
}
