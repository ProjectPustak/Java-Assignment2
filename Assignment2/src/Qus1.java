import java.util.Scanner;

public class Qus1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the redious of the Circle:- ");
        int r = in.nextInt();

        float pi = 3.14f;

        float area = pi*(r*r);

        System.out.println("The Area of the Circle is:- "+area);

    }
}
