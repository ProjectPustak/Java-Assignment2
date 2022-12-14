import java.util.Scanner;

public class Qus10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the value of the Side: ");

        int a = inp.nextInt();

        System.out.println("Enter the Value of Base: ");

        int b = inp.nextInt();

        int p = 2*(a+b);

        System.out.println("The Perimeter of the Parallelogram is "+p);


    }
}
