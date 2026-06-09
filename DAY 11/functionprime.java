import java.util.Scanner;

public class functionprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        int result = funcprime(num , count);
         if(result == 2){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");

        }
    }
    public static int funcprime(int num , int count){
        for(int i=1 ; i<=num ; i++){
            if(num % i == 0){
                count++;
            }
        }
       return count;
    }
}
