import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find in an array:");
        int x = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            if(x==arr[i]){
                System.out.println(" The number " + x + " is found at index " + i );
            }
        }
    }
}
