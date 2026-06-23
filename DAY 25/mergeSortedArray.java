import java.util.*;

public class mergeSortedArray {
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

        ArrayList <Integer> list = new ArrayList<>();
        for(int num1 : arr1)
        list.add(num1);

        for(int num2 : arr2)
        list.add(num2);

        Collections.sort(list);
        System.out.println(list);
    }    
}
