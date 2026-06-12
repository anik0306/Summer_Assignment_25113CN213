import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find the frequency in an array:");
        int x = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            if(x==arr[i]){
                count++;
            }
        }
        System.out.println(" The number " + x + " appears " + count + " times. ");
    }
}
