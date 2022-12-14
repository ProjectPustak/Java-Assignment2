import java.util.Scanner;

public class Qus25 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int  n = inp.nextInt();

        int max=0;

        while (n!=0){
             if(n>max){
                 max=n;
             }
            System.out.println("Enter the Number: ");
            n=inp.nextInt();

        }
        System.out.println("The Largest Number is: "+max);



    }
}
