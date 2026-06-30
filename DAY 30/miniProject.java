import java.util.Scanner;

public class miniProject {
    static Scanner sc = new Scanner(System.in);

    static String[] food = {"Dal Tadka"  , "Kadai Paneer" , "Shahi Paneer" , "Jeera Rice" , "Nan Roti"};
    static int[] price = {80 , 150 , 160 , 70 , 7};
    static int[] quantity = new int[5];

    public static void displayMenu(){
        System.out.println("-----------------MENU-----------------");
        System.out.println("Sno.\tFood Item\tPrice");

        for(int i=0 ; i<5 ; i++){
            System.out.println((i+1) + "\t" + food[i] + "\t" + price[i] + " Rs.");
        }
    }

    public static void placeOrder(){
        boolean flag = true;
        while(flag){
            displayMenu();
            System.out.print("Enter Food Number: ");
            int item = sc.nextInt();

            if(item >= 1 && item <= food.length){
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                quantity[item-1] += qty;
                System.out.println("Order Added Successfully!"); 
            } else{
                System.out.println("Invalid Food Number!");
            }

            System.out.println("Order anything else ? (Y/N) : ");
            char ch = sc.next().charAt(0);

            if(ch == 'Y' || ch == 'y'){
                flag = true;
            }else{
                flag = false;
            }
        }
    }

    public static void viewBill(){
        int total = 0;
        System.out.println("--------------BILL--------------");
        System.out.println("Sno.\tFood Item\tPrice\t  Qyantity\t    Amount");

        for(int i=0 ; i<5 ; i++){
            if(quantity[i] > 0){
                int amt = quantity[i] * price[i];
                total += amt;
                System.out.println((i+1) + "\t" + food[i] + "\t" + price[i] + " Rs." + "\t\t" + quantity[i] + "\t\t" + amt + " Rs. ");
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Total Bill = " + total + " Rs.");
    }

    public static void main(String[] args){
        boolean flag = true;
        while(flag){
            System.out.println("\t\tRestaurant Billing Syatem");
            System.out.println("1. Display Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Bill");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    displayMenu();
                    break;

                case 2:
                    placeOrder();
                    break;
                    
                case 3:
                    viewBill();
                    break;
                    
                case 4:
                    System.out.println("!!THANK YOU!!\nPlease Visit Again.");
                    flag = false;
                    break;
                    
                default:
                    System.out.println("Invalid Choice.");
                    break;    

            }

        }
    }
    
}
