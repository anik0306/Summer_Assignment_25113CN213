import java.util.Scanner;

public class multiplyMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns for first matrix: ");
        System.out.print("Enter rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter columns: ");
        int col1 = sc.nextInt();
        System.out.println("Enter the rows and columns for second matrix: ");
        System.out.print("Enter rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter columns: ");
        int col2 = sc.nextInt();
        if(col1 != rows2){
            System.out.println("Multiplication is not possible.");
        }else{
            int m1[][] = new int[rows1][col1];
            System.out.println("Enter the elements of first matrix:");
            for(int i = 0 ; i<rows1 ; i++){
                for(int j=0 ; j<col1 ; j++){
                    m1[i][j] = sc.nextInt();
                }
            }
            int m2[][] = new int[rows2][col2];
            System.out.println("Enter the elements of second matrix:");
            for(int i = 0 ; i<rows2 ; i++){
                for(int j=0 ; j<col2 ; j++){
                    m2[i][j] = sc.nextInt();
                }
            }
            int m3[][] = new int[rows1][col2];
            System.out.println("Multiplication of matrix is:");
            for(int i=0 ; i<rows1 ; i++){
                for(int j=0 ; j<col2 ; j++){
                    m3[i][j] = 0;
                    for(int k=0 ; k<col1 ; k++){
                        m3[i][j] += (m1[i][k] * m2[k][j]);
                    }
                }
            }
            for(int i=0 ; i<rows1 ; i++){
                for(int j=0 ; j<col2 ; j++){
                    System.out.print(m3[i][j] + " ");
                }
                System.out.println();
            }
        }
    }    
}
