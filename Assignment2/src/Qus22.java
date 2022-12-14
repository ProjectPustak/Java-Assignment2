import java.util.Scanner;

public class Qus22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number: ");

        int n = sc.nextInt();

        int sum = 0;
        int pro =1;
        int ans =0;
        while (n >0) {
            int rem = n % 10;



            sum =sum+rem;

            pro=pro*rem;
            ans =pro-sum;

            n = n/10;

        }
        System.out.println(ans);



    }
}
