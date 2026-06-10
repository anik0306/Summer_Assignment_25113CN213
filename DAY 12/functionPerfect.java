import java.util.Scanner;

public class functionPerfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        int result = funcPerfect(n , sum);
        if(result == n){
            System.out.println(n + " is a perfect number "); 
        }else{
            System.out.println(n + " is not a perfect number ");
        }
    }

    public static int funcPerfect(int n , int sum){
        for(int i = 1 ; i<n ; i++){
        if(n % i == 0){
            sum += i;
        }
        }
        return sum;
    }
}

