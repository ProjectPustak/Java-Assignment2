import java.util.Scanner;

public class Qus21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:- ");

        int n = sc.nextInt();

        int a =0;
        int b =1;
        int count =0;

        while (count<=n){
            System.out.println("The Fibonacci Series is "+count);
            a=b;
            b=count;
            count=b+a;
        }

    }
}
