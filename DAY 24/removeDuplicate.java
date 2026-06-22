import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        String result = "";
        
        for(int i=0 ; i<st.length() ; i++){
            char ch = st.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println(result);
    }    
}
