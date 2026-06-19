import java.util.Scanner;

public class stringCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        int v = 0;
        int c = 0;
        for(int i=0 ; i<st.length() ; i++){
            char ch = st.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    v++;
                }else{
                    c++;
                }
            }
        }
        System.out.println("The number of vowels in given sentence is: " + v);
        System.out.println("The number of consonents in given sentence is: " + c);
    }    
}
