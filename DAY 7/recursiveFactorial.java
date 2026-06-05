import java.util.Scanner;

public class recursiveFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static int calculateFactorial(int n){
        if(n == 1 || n==0){
            return 1;
        }
        int result = n * calculateFactorial(n-1);
        return result;  
    }
    
}
