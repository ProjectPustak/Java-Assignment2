import java.util.Scanner;

public class Qus23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = in.nextInt();



        for (int i = 1; i <= num; i++) {
            if(num % i==0){
                System.out.println("The Factor of the Number is"+i);
            }

        }
    }
}
