import java.util.Scanner;

public class sumAvgArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            sum += arr[i];
        }    
        int avg = sum / n;
        System.out.println("sum of the given array: " + sum );
        System.out.println("average of the given array: " + avg );
    }
}
