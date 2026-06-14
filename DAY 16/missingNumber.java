import java.util.Scanner;
public class missingNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int total = n*(n+1)/2;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum += arr[i];
        }
        int miss = total - sum ;
        System.out.println("The missing number is:" + miss);
    }    
}
