import java.util.Scanner;
public class alphabaticallySort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        String[] st = new String[n];
        System.out.println("Enter the names:");
        for(int i=0 ; i<n ; i++){
            st[i] = sc.next();
        }
        
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(st[i].compareTo(st[j]) > 0){
                    String temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        System.out.println("Alphabetically sorted names:");
        for(int i=0 ; i<n ; i++){
            System.out.println(st[i]);
        }
    }    
}
