import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args) {
        //Isosceles Triangle

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length of the Isosceles Triangle:-: ");
        int a = sc.nextInt();

        System.out.println("Enter the base of the Isosceles Triangle:-: ");
        int b = sc.nextInt();

        float h =(float) Math.sqrt((a*a)-((b*b)/4));

        float area =(float) 0.5*b*h;

        System.out.println("The area of a Isosecles Triangle is: "+area+" cm2");



    }
}
