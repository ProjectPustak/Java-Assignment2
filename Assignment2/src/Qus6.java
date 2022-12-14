import java.util.Scanner;

public class Qus6 {

    public static void main(String[] args) {
        //Area of a Rhombus

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Diagonal1: ");
        int d1 = inp.nextInt();

        System.out.println("Enter the Diagonal2: ");
        int d2 = inp.nextInt();

        int area = (d1*d2)/2;

        System.out.println("The Area of a Rhombus is: "+area);


    }
}
