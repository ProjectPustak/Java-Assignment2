import java.util.Scanner;

public class Qus7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Side of Triangle: ");

        int a = inp.nextInt();

        float h =(float) Math.sqrt(3);

        float area = (h*a*a)/4;

        System.out.println("The Area of the Equilateral Triangle is:- " +area+" cm2");
    }
}
