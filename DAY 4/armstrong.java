import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        int count = 0;
        while(num>0){
            int rem = num%10;
            count++;
            num /= 10;
        }
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        if(sum == n){
            System.out.println(n + " is an Armstrong number. ");
        } else {
            System.out.println(n + " is not an Armstrong number. ");
        }
    }
}