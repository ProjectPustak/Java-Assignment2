import java.util.Scanner;

public class Qus20 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Side of the Cube: ");
        int a = inp.nextInt();

        int sa = 6*a*a;

        System.out.println("The Total Surface Area of the Cube is: "+sa);
    }
}
