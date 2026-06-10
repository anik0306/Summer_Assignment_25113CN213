import java.util.Scanner;
import java.lang.Math;

public class functionArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int num1 = n;
        while(num1 > 0){
            count++;
            num1 /= 10;
        }
        int result = funcarmstrong(n , count , sum);
        if(result == n){
            System.out.println(n + " is a Armstrong number ");
        }else{
            System.out.println(n + " is not a Armstrong number ");
        }
    }

    public static int funcarmstrong(int n , int count , int sum){
        int num2 = n;
        while(num2 > 0){
            int rem = num2 % 10;
            sum += Math.pow(rem,count);
            num2 /= 10;
        }
        return sum;
    }
}
