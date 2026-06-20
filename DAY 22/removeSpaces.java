import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        String newst = "";
        for(int i=0 ; i<st.length() ; i++){
            if(st.charAt(i) == ' '){
                continue;
            }else{
                newst += st.charAt(i);
            }
        }
        System.out.print(newst);
    }    
}
