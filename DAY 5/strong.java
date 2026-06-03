import java.util.Scanner;
public class strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int num = n;
        while(num > 0){
            int rem = num % 10;
            int fact = 1;
            for(int i = 1 ; i<=rem ; i++){
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if(sum == n){
            System.out.println(n + " is a strong number.");
        } else {
            System.out.println(n + " is not a strong number.");
        }
    }
}
