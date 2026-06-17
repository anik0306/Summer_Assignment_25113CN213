import java.util.Scanner;

public class digonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int col = sc.nextInt();
        int m1[][] = new int[rows][col];
        if(rows == col){
            System.out.println("Enter the elements of matrix:");
            for(int i=0 ; i<rows ; i++){
                for(int j=0 ; j<col ; j++){
                    m1[i][j] = sc.nextInt();
                }
            }
            int sum=0;
            for(int i=0 ; i<rows ; i++){
                for(int j=0 ; j<col ; j++){
                    if(i == j){
                        sum += m1[i][j];
                    }
                }
            }
            System.out.println("Sum of digonal elements is: " + sum);
        }else{
            System.out.println("The sum of digonals is not possible");
        }
    }    
}
