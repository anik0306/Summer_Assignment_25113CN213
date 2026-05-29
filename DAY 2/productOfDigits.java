import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int prod=1;
        while(n>0){
            int rem = n%10;
            prod *= rem;
            n /= 10;
        }
        System.out.println("Product of digits: " + prod);
    }
}
