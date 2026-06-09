import java.util.Scanner;

public class functionfactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int result = funcfact(num);
        System.out.print("The factorial of " + num + " is:" + result);
    }
    public static int funcfact(int num){
        int fact = 1;
        for(int i=num ; i>=1 ; i--)
        fact *= i;
        return fact;
    }
}
