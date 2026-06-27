import java.util.Scanner;
public class stringOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Tony";
        boolean flag = true;

        while(flag){
            System.out.println("\t\tString Operations");
            System.out.println("1. Concatenate String");
            System.out.println("2. Length of String");
            System.out.println("3. Compare Two String");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    System.out.println("Enter another string");
                    String str1 = sc.next();
                    String finalStr = str + str1;
                    System.out.print("Final String: " + finalStr);
                    break;

                case 2:
                    System.out.println("Length of String: " + str.length());
                    break;

                case 3:
                    System.out.println("Enter the String to compare: ");
                    String compare = sc.next();

                    if(str.compareTo(compare) == 0){
                        System.out.println("Strings are Equal.");
                    }else{
                        System.out.println("Strings are not Equal.");
                    }
                    break;

                case 4:
                    String reverse = "";
                    for(int i=str.length()-1 ; i>=0 ; i--){
                        reverse += str.charAt(i);
                    }
                    System.out.println(reverse);
                    break;

                case 5:
                    System.out.println("!!THANK YOU!!\nExiting...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;    

            }
        }
    }
}
