import java.util.Scanner;

public class characterFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        for(int i=0 ; i<st.length() ; i++){
            int count = 0;
            if(st.charAt(i) == ' '){
                continue;
            }
            if(st.indexOf(st.charAt(i)) < i){
                continue;
            }
            for(int j=0 ; j<st.length() ; j++){
                if(st.charAt(i) == st.charAt(j)){
                    count++;
                }
            }
            System.out.println("The frequency of " + st.charAt(i) + " is: " + count);
        }
    }    
}
