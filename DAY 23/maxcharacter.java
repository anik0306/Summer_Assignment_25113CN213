import java.util.Scanner;
public class maxcharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String st = sc.nextLine();
        int max=0;
        char maxChar = ' ';
        for(int i=0 ; i<st.length() ; i++){
            int count = 0;
            for(int j=0 ; j<st.length() ; j++){
                if(st.charAt(i) == st.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                maxChar = st.charAt(i);
                max = count;
            }
        }
        System.out.print("The maximum character is: " + maxChar);
    }    
}
