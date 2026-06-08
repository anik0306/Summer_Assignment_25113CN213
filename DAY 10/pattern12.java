import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i = 1 ; i<=rows ; i++){
            //spaces
            for(int j=1 ; j<=rows-i ; j++){
                System.out.print(" ");
            }
            
            //firsthalf
            char ch = 65;
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }

            //secondhalf
            char cha = (char)(65+i-2);
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(cha);
                cha--;
            }
            System.out.println();
        }
    }
}
