import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();

        for(int i=1 ; i<=rows ; i++){
            //spaces
            for(int j=1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }

            //firsthalf
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }

            //secondhalf
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       
    }
}
