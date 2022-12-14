import java.util.Scanner;

public class Qus14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //volume of a cone is =(pi*r2*h);

        System.out.println("Enter the Radious of the Cone");

        int r = inp.nextInt();

        System.out.println("Enter the Height of Cone: ");

        int h = inp.nextInt();

        float pi = 3.14f;

        float v = (pi*r*r*h)/3;

        System.out.println("The Volume of the Cone is: "+v+" com3");


    }
}
