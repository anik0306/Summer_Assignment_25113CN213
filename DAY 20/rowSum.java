import java.util.Scanner;

public class rowSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int col = sc.nextInt();
        int m1[][] = new int[rows][col];
        System.out.println("Enter the elements of first matrix:");
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<col ; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<rows ; i++){
            int rowsum = 0;
            for(int j=0 ; j<col ; j++){
                rowsum += m1[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " is: " + rowsum);
        }
    }    
}
