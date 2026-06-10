import java.util.Scanner;

public class functionPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int rev = 0;
        int result = funcPalindrome(num,rev);
        if(result==num){
            System.out.print(num + " is a palindrome number. ");
        }else{
            System.out.print(num + " is not a palindrome number. ");
        }
    }

    public static int funcPalindrome(int num , int rev){
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num /= 10;
        }
        return rev;
    } 
}
