import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int col = sc.nextInt();
        int m1[][] = new int[rows][col];
        System.out.println("Enter the elements of matrix:");
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<col ; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of the given matrix is:");
        for(int i=0 ; i<col ; i++){
            for(int j=0 ; j<rows ; j++){
                System.out.print(m1[j][i] + " ");
            }
            System.out.println();
        }
    }    
}
