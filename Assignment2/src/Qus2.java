import java.util.Scanner;

public class Qus2 {
    public static void main(String[] args) {
        Scanner inp  = new Scanner(System.in);

        System.out.println("Enter the Height in cm: ");
        int height = inp.nextInt();

        System.out.println("Enter the Base Value in cm: ");
        int base = inp.nextInt();

        int area = (height*base)/2;

        System.out.println("The area of the Triangle is: "+area+" cm2");
    }
}
