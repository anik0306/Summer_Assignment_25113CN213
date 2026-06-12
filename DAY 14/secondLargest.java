import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int max2 = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i] > max2){
                if(arr[i] != max){
                    max2 = arr[i];
                }
            }
        }
        System.out.println("second largest number of given array is : " + max2);
    }
}
