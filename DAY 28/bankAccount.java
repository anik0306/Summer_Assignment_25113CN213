import java.util.Scanner;
public class bankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        String[] accNo = new String[100];
        double[] balance = new double[100];

        String acc;
        double amt;
        boolean flag = true;
        int count = 0;

        while(flag){
            System.out.println("\t\tBank Account Management");
            System.out.println("1.Add Account");
            System.out.println("2.Display all Accounts");
            System.out.println("3.Deposite Money");
            System.out.println("4.Withdraw Money");
            System.out.println("5.Exit");

            System.out.println("Enter your choice=");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Account No: ");
                    accNo[count] = sc.next();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    balance[count] = 0.0;
                    System.out.println("Account Created Successfully.");
                    count++;
                    break;

                case 2:
                    if(count == 0){
                    System.out.println("No Account Found!");
                    }else{
                        System.out.println("Account Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Account " + (i+1));
                            System.out.println("Account No: " + accNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Balance: " + balance[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter account number: ");
                    acc = sc.next();
                    boolean found = false;

                    for(int i=0 ; i<count ; i++){
                        if(accNo[i].equals(acc)){
                            System.out.println("Enter amount to be deposite: ");
                            amt = sc.nextDouble();
                            balance[i] += amt;
                            System.out.println(amt + " deposited successfully.");
                            
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("ERROR : Account not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter account number: ");
                    acc = sc.next();
                    found = false;

                    for(int i=0 ; i<count ; i++){
                        if(accNo[i].equals(acc)){

                            System.out.println("Enter the amount for withdraw=");
                            amt = sc.nextDouble();

                            if(amt<=balance[i] && amt>0){
                                balance[i] -= amt;
                                System.out.println(amt + " withdraw successfully");
                            }else{
                                System.out.println("Low balance!");
                            }
                            found = true;
                            break;    
                        }
                    }
                    if(!found){
                        System.out.println("ERROR : Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("EXIT");
                    flag = false;
                    break;
                    
                default:
                    System.out.println("Invalid Choice.");
                    break;    

            }
        }
    }        
    
}
