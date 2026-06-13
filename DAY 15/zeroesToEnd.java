import java.util.Scanner;
public class zeroesToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
            }else{
                continue;
            }
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
