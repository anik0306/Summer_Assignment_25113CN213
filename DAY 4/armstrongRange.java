import java.util.Scanner;
import java.lang.Math;
public class armstrongRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit:");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers between 1 and " + n + " are: ");
        for(int i = 1 ; i<=n ; i++){
        int num = i;
        int sum = 0;
        int count = 0;
        while(num>0){
            int rem = num%10;
            count++;
            num /= 10;
        }
        int temp = i;
        while(temp>0){
            int rem = temp%10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        if(sum == i){
            System.out.print(i + " ");
        }
        }
    }
}
