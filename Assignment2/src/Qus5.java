import java.util.Scanner;

public class Qus5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base of the parallelogram: ");
        int b = in.nextInt();

        System.out.println("Enter the height of the parallelogram: ");
        int h = in.nextInt();

        int area  = b*h;

        System.out.println("The area of a Parallelogram is: "+area);




    }
}
