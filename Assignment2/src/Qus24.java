import java.util.Scanner;

public class Qus24 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int n = inp.nextInt();
        int sum=0;

        while(n!=0){

            sum=sum+n;
            System.out.println("Enter the Number: ");
            n=inp.nextInt();
        }
        System.out.println("The sum of this all Number is: "+sum);

    }
}
