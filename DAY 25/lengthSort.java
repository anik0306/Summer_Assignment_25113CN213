import java.util.Scanner;
public class lengthSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = sc.nextInt();
        String[] st = new String[n];
        System.out.println("Enter the words:");
        for(int i=0 ; i<n ; i++){
            st[i] = sc.next();
        }
        
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(st[i].length() > st[j].length()){
                    String temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        System.out.println("length sorted words:");
        for(int i=0 ; i<n ; i++){
            System.out.println(st[i]);
        }
    }    
}
