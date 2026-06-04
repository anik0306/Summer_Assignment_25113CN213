import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n = sc.nextInt();
        int base = 1;
        int binary = 0;
        while(n>0){
            int rem = n % 2;
            binary += rem * base;
            n /= 2 ;
            base *= 10; 
        }
        System.out.println("Binary number: " + binary);
    }
    
}
