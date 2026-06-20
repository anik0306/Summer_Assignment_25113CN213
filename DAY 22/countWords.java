import java.util.Scanner;

public class countWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        int count = 0;
        for(int i=0 ; i<st.length() ; i++){
            char ch = st.charAt(i);
            if(ch == ' '){
                continue;
            }else{
                count++;
            }
        }
        System.out.println("The total number of words in given sentence is: " + count);
    }    
}
