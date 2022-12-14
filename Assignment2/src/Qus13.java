import java.util.Scanner;

public class Qus13 {

    public static void main(String[] args) {
        //perimeter of the Rhombus

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Value of Side of the Rhombus: ");

        int a = inp.nextInt();

        int peri = 4*a;

        System.out.println("The perimeter of the Rhombus is "+peri);

    }
}
