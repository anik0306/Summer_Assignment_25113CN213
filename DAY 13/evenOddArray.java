import java.util.Scanner;
public class evenOddArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countEven = 0;
        int countOdd = 0;
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("even numbers: " + countEven);
        System.out.println("odd numbers: " + countOdd);
    }
}
