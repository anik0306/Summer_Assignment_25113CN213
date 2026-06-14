import java.util.Scanner;
public class pairWithSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target:");
        int target=sc.nextInt();
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }    
}
