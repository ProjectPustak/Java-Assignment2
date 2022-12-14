import java.util.Scanner;

public class Qus11 {
    public static void main(String[] args) {
        //Perimeter of a Rectangle.
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle: ");

        int l = inp.nextInt();

        System.out.println("Enter the Width of the Rectangle ");

        int w = inp.nextInt();

        int p = 2*(l+w);

        System.out.println("The Perimeter of the Rectangle is: "+p);

    }
}
