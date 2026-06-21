import java.util.Scanner;

public class firstNonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        for(int i=0 ; i<st.length() ; i++){
            int count = 1;
            for(int j=0 ; j<st.length() ; j++){
                if(st.charAt(i) == st.charAt(j) && i!=j ){
                    count++;
                    break;
                }
            }
            if(count == 1){
                System.out.println(st.charAt(i));
                break;
            }
        }
    }    
}
