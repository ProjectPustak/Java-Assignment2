import java.util.Scanner;

public class Qus12 {
    public static void main(String[] args) {
        //Perimeter of a Square
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Value of the Side of the Square: ");

        int a = inp.nextInt();

        int peri = 4*a;

        System.out.println("The Perimeter of the Square is :"+peri);



    }
}
