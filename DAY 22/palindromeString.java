import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        String reverse = "";
        for(int i=st.length()-1 ; i>=0 ; i--){
            reverse += st.charAt(i);
        }
        if(reverse.compareTo(st) == 0){
            System.out.println("String is palindrome.");
        }else{
            System.out.println("String is not palindrome.");
        }
    }
}
