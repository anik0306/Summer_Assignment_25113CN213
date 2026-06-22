import java.util.Scanner;

public class stringRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st1 = sc.nextLine();
        System.out.println("Enter a string to check rotation:");
        String st2 = sc.nextLine();
        if(st1.length() != st2.length()){
            System.out.println("No string rotation.");
        }

        String doubled = st1 + st1 ;

        if(doubled.contains(st2)){
            System.out.println("String rotation.");
        }else{
            System.out.println("Not a String rotation.");
        }
    }    
}
