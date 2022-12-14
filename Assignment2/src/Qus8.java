import java.util.Scanner;

public class Qus8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Value of the Radius of the Circle:- ");

        int r = inp.nextInt();

        float pi = 3.14f;

        float area = 2*pi*r;

        System.out.println("The Perimeter of the Circle is: "+area);
    }
}
