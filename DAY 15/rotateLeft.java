import java.util.Scanner;
public class rotateLeft {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of times you want to rotate:");
        int rot = sc.nextInt();
        rot %= n;
        for(int i=0 ; i<rot ; i++){
            int first = arr[0];
            for(int j=0 ; j<n-1 ; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
