import java.util.Scanner;

public class functionmaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        int max = funcmax(num1 , num2);
        System.out.println("The maximum number is:" + max);
    }
    public static int funcmax(int num1 , int num2){
        if(num1 >= num2){
            return num1;
        }else{
            return num2;
        }
    }
}
