import java.util.Scanner;

public class lcm {
public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number :");
    int num1 = sc.nextInt();
    System.out.print("Enter the second number :");
    int num2 = sc.nextInt();
    for(int i=1 ; i<=num1*num2 ; i++){
        if(i%num1==0 && i%num2==0){
            System.out.println("LCM of "+num1+" and "+num2+" is: "+i);
            break;
        }
    }
}
}
