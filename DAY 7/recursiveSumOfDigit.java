import java.util.Scanner;

public class recursiveSumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = calculateSum(n);
        System.out.println("Sum of digits is: " + result);
    }
    public static int calculateSum(int n){
        if(n==0){
            return 0;
        }
        int rem = n % 10;
        int sum = rem + calculateSum(n/10);
        return sum;
    }
}
