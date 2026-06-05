import java.util.Scanner;

public class recursiveFebonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Fibonacci series:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " is:");
        for(int i = 1 ; i<=n ; i++){
            int result = calculateFebonnaci(i);
            System.out.print(result + " ");
        }
    }
    public static int calculateFebonnaci(int i){
        if(i==1){
            return 0;
        }
        if(i==2){
            return 1;
        }
        int result = calculateFebonnaci(i-1) + calculateFebonnaci(i-2);
        return result;
    }
    
}
