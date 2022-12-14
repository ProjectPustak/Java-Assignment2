import java.util.Scanner;

public class Qus16 {
    public static void main(String[] args) {
        //Volume of a Cylinder.

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Radious value:- ");

        int r = inp.nextInt();

        System.out.println("Enter the Height:-");

        int h = inp.nextInt();

        float pi = 3.14f;

        float v = pi*r*r*h;

        System.out.println("The Vloume is Cylinder: "+v+" cm3");


    }
}
