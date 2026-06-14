import java.util.Scanner;

public class maxFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int maxelement=arr[0];
        int maxcount=0;
        for(int i=0 ; i<n ; i++){
        int count=0;
            for(int j=0 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                maxelement = arr[i];
            }
        }
        System.out.println("The element with the maximum frequency is " + maxelement);
        System.out.println("it appears " + maxcount + " times.");
    }    
}
