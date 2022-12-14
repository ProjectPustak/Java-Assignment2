import java.util.Scanner;

public class Qus9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Value of the Side: ");

        int a = inp.nextInt();

        int perimeter = 3*a;

        System.out.println("The Perimeter of the Triangle is:- "+perimeter);
    }
}
