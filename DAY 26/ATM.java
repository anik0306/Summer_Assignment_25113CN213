import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100000;
        double amt;
        boolean flag = true;

        while(flag){
            System.out.println("\t\tATM Menu\t\t");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposite Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

            System.out.println("Enter your choice=");
            int ch = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Your current balance is: " + balance);
                break;

                case 2: System.out.println("Enter the amount to deposite=");
                amt = sc.nextDouble();
                balance += amt;
                System.out.println(amt + " deposited successfully.");
                break;

                case 3: System.out.println("Enter the amount for withdrawl=");
                amt = sc.nextDouble();
                if(amt<=balance){
                    balance -= amt;
                    System.out.println(amt + " withdraw successfully");
                }else{
                    System.out.println("Low balance!");
                }
                break;

                case 4: System.out.println("Thank You for using ATM.");
                System.out.println("Please visit again.");
                flag =false;
                break;

                default: System.out.println("ERROR : Wrong choice"); 
                break;
            }
        }
    }
}
