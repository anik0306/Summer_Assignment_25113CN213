import java.util.Scanner;

public class mergingOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of first array:");
        int n1 = sc.nextInt();
        System.out.print("enter the range of second array:");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i = 0 ; i<n1 ; i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n2];
        for(int i = 0 ; i<n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        int n3 = n1 + n2;
        int arr[] = new int[n3];
        for(int i=0 ; i<n1 ; i++){
            arr[i] = arr1[i];
        }
        for(int i=0 ; i<n2 ; i++){
            arr[n1+i] = arr2[i];
        }
        for(int i=0 ; i<n3 ; i++){
            System.out.print(arr[i] + " ");
        }
    }    
}
