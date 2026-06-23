import java.util.HashSet;
import java.util.Scanner;

public class commonCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String st1 = sc.nextLine();
        System.out.println("Enter 2nd string:");
        String st2 = sc.nextLine();

        System.out.println("Common elements are:");

        HashSet<Character> set = new HashSet<>();
        
        for(int i=0 ; i<st1.length() ; i++){
            char ch = st1.charAt(i);
            if(ch==' '){
                continue;
            }
            set.add(ch);
        }
        for(int i=0 ; i<st2.length() ; i++){
            char ch2 = st2.charAt(i);
            if(set.contains(ch2)){
                System.out.println(ch2 + " ");
                set.remove(ch2);
            }
        }
    }    
}
