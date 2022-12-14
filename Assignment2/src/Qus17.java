import java.util.Scanner;

public class Qus17 {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Radious of the Sphere:-");

        int r = inp.nextInt();


        float pi = 3.14f;


        float v =(pi*r*r*r);

        float volume = (4*v)/3;

        System.out.println("The Volume of the Sphere is:-"+volume);


    }
}
