import java.util.Scanner;
import java.util.HashSet;
public class common {
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
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<n1 ; i++){
            set.add(arr1[i]);
        }
        for(int j=0 ; j<n2 ; j++){
            if(set.contains(arr2[j])){
                System.out.print(arr2[j] + " ");
                set.remove(arr2[j]);
            }
        }
    }    
}
