import java.util.Scanner;

public class count {
    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        int num=n;
        while(num>0){
            num /= 10;
            count++;
        }
        System.out.println("Number of digits in " + n + " is: " + count);
    }
    
}
