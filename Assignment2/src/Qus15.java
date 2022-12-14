import java.util.Scanner;

public class Qus15 {
    public static void main(String[] args) {
        //Volume of a Prism

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base of the Prism: ");
        int b = sc.nextInt();

        System.out.println("Enter the Height of the Prism: ");

        int h = sc.nextInt();

        int v = h*b;

        System.out.println("The Volume of the Prism is:" +v);


    }
}
