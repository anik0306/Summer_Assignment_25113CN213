import java.util.*;

public class anagramString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String st1 = sc.nextLine();
        System.out.println("Enter 2nd string:");
        String st2 = sc.nextLine();

        if(st1.length() != st2.length()){
            System.out.println("Strings are not anagram strings.");
            return;
        }

        int arr[] = new int[26];
        for(int i=0 ; i<st1.length() ; i++){
        arr[st1.charAt(i) - 'a']++;
        }
        for(int i=0 ; i<st2.length() ; i++){
            arr[st2.charAt(i) - 'a']--;
            if(arr[st2.charAt(i) - 'a'] < 0){
                System.out.println("Strings are not anagram strings.");
                return;
            }
        }
        boolean isAnagram = true;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Strings are anagram strings.");
        }else{
            System.out.println("Strings are not anagram strings.");
        }

    }    
}
