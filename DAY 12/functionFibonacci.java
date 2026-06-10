import java.util.Scanner;

public class functionFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of series:");
        int n = sc.nextInt();
        System.out.print("Fibonacci series:");
        funcFibo(n);
    }

    public static void funcFibo(int n){
        int a = 0;
        int b = 1;
        for(int i = 1 ; i<=n ; i++){
            if(i==1){
                System.out.print(a + " ");
            }else if(i==2){
                System.out.print(b + " ");
            }else{
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
       
        }
    } 
}
