import java.util.Scanner;

public class fibonacciTerm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n == 1){
            System.out.println("The " + n + "st term of the Fibonacci series is: " + a);
        } else if(n == 2){
            System.out.println("The " + n + "nd term of the Fibonacci series is: " + b);
        } else {
            int c = 0;
            for(int i = 3 ; i<=n ; i++){
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println("The " + n + " term of the Fibonacci series is: " + c);
        }
    }
   
}
