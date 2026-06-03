import java.util.Scanner;
public class maxPrimeFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int maxPrime = 0;
        int num = n;
        for(int i = 2 ; i<=num ; i++){
            while(num %i == 0){
                maxPrime = i;
                num /= i;
            }
        }
        System.out.println("The maximum prime factor of " + n + " is " + maxPrime);
    }
}
