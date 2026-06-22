import java.util.Scanner;

public class compressString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        
        int count = 1;
        for(int i=0 ; i<st.length() ; i++){
            if(i+1<st.length() && st.charAt(i) == st.charAt(i+1)){
                count++;
            }else{
                System.out.print(st.charAt(i) + "" + count);
                count=1;
            }
        }
    }    
}
