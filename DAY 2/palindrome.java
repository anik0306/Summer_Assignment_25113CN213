import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num /= 10;
        }
        if(rev == n){
            System.out.println(n+" is a palindrome.");
        } else {
            System.out.println(n+" is not a palindrome.");
        }
    }
}

