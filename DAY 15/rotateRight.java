import java.util.Scanner;
public class rotateRight {
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
            int last = arr[n-1];
            for(int j=n-1 ; j>0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
