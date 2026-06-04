import java.util.Scanner;

public class countBits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n = sc.nextInt();
        int count = 0;
        int binary = 0;
        int base = 1;
        int num = n;
        while(n>0){
            int rem = n % 2;
            binary += rem * base;
            if(rem == 1){
                count++;
            }
            n /= 2;
            base *= 10;
        }
        System.out.println("Number of set bits in " + num + " is: "  + count);
    }
}
