import java.util.Scanner;

public class symmetricMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows/columns for square matrix: ");
        int n = sc.nextInt();
        int m1[][] = new int[n][n];
        System.out.println("Enter the elements of matrix:");
        for(int i = 0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                m1[i][j] = sc.nextInt();
            }
        }
        if(isSymmetric(m1 , n)){
            System.out.println("The matrix is symmetric.");
        }else{
            System.out.println("The matrix is not symmetric.");
        }
    }    

    public static boolean isSymmetric(int m1[][] , int n){
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(m1[i][j] != m1[j][i]){
                    return false;
                }    
            }
        }
        return true;
    }
}
