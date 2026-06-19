import java.util.Scanner;

public class stringLCtoUC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        for(int i=0 ; i<st.length() ; i++){
            char ch = st.charAt(i);
            if(ch>=97 && ch<=122){
                ch -= 32;
            }
            System.out.print(ch);
        }
    }    
}
