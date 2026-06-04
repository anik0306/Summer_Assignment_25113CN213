import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        int n = sc.nextInt();
        int decimal = 0;
        int base = 1;
        while(n>0){
            int rem = n % 10;
            decimal += rem * base;
            n /= 10;
            base *= 2;
        }
        System.out.println("Decimal number: " + decimal);
    }
}
