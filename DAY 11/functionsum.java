import java.util.Scanner;

public class functionsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number:");
        int num2 = sc.nextInt();
        int result = funcSum(num1 , num2);
        System.out.print("The sum of " + num1 + " and " + num2 + " is:" + result);
    }
    public static int funcSum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
}
