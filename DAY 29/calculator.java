import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("\t\tCalculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Enter your choice=");
            int ch = sc.nextInt();

            if(ch == 5){
                System.out.println("!!THANK YOU!! \n Exiting...");
                flag = false;
            }else{
                System.out.println("Enter First number: ");
                double num1 = sc.nextInt();
                System.out.println("Enter Second number: ");
                double num2 = sc.nextInt();
    
                switch(ch){
                    case 1:
                        double add = num1 + num2;
                        System.out.println("Addition= " + add);
                        break;
    
                    case 2:
                        if(num1 >= num2){
                            double sub = num1 - num2;
                            System.out.println("Subtraction= " + sub);
                        }else{
                            System.out.println("ERROR : Negetive Answer!");
                        }
                        break;
    
                    case 3:
                        double product = num1 * num2;
                        System.out.println("Multiplication= " + product);
                        break;
    
                    case 4:
                        if(num2 != 0){
                            double div = num1 / num2;
                            System.out.println("Division= " + div);
                        }else{
                            System.out.println("ERROR : Divisor is Zero!");
                        }
                        break;
                        

                    default:
                        System.out.println("Invalid choice");
                        break;    
    
                }
            }
        }
    }
    
}
