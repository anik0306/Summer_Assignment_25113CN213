import java.util.Scanner;

public class stringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        int length = 0;
        for(char ch : st.toCharArray()){
            length++;
        }
        System.out.println("The length of given string is: " + length);
    }
}
