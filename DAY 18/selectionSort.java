import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            int min=i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
