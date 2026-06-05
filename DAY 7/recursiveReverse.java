import java.util.Scanner;

public class recursiveReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int rev = 0;
        int result = reverse(n , rev);
        System.out.println("Reversed number is: " + result);
    }
    public static int reverse(int n, int rev){
        if(n==0){
            return rev;
        }
        int rem = n % 10;
        rev = rev*10 + rem;
        return reverse(n/10, rev);
    }
}
