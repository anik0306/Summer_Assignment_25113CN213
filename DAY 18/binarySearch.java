import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be find in array: ");
        int x = sc.nextInt();
        int beg = 0;
        int end = n-1;
        int mid = (beg+end)/2;
        while(beg<=end && x!=arr[mid]){
            if(x < arr[mid]){
                end = mid-1;
            }else if(x > arr[mid]){
                beg = mid+1;
            }
            mid = (beg+end)/2;
        }
        if(x == arr[mid]){
            System.out.print("Element found at index : " + (mid+1) );
        }
    }
}
