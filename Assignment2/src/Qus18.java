import java.util.Scanner;

public class Qus18 {

    public static void main(String[] args) {
        //Volume of a Pyramid

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Base Length: ");
        int base_lenght = inp.nextInt();

        System.out.println("Enter the Base Width: ");
        int base_width = inp.nextInt();

        System.out.println("Enter the Pyramid Height: ");
        int height = inp.nextInt();

        int volume = (base_width*base_lenght*height)/3;

        System.out.println("The Volume of a Pyramid is:  "+volume);


    }
}
