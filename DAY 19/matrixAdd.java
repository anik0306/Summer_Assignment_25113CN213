import java.util.Scanner;

public class matrixAdd {
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
        int m2[][] = new int[rows][col];
        System.out.println("Enter the elements of second matrix:");
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<col ; j++){
                m2[i][j] = sc.nextInt();
            }
        }
        int m3[][] = new int[rows][col];
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<col ; j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The sum of two matrix is:");
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
