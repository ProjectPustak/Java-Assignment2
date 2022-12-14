import java.util.Scanner;

public class Qus19 {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radious of the Cylinder: ");
        float r = sc.nextFloat();

        System.out.println("Enter the Height: ");
        int h = sc.nextInt();

        float pi = 3.14f;

        float sa = 2*pi*r*h;

        System.out.println("The Surface area A Cylinder is: "+Math.round(sa));
    }
}
