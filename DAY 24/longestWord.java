import java.util.Scanner;

public class longestWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();

        String words[] = st.split(" ");
    
        String maxword = "";
        for(String word : words){
            if(word.length() > maxword.length()){
                maxword = word;
            }
        }
        System.out.println("The longest word: " + maxword);
    }    
}
