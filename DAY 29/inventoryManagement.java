import java.util.Scanner;

public class inventoryManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] itemNo = new int[100];
        int[] quantity = new int[100];
        String[] itemName = new String[100];
        double[] price = new double[100];
        int count = 0;
        boolean flag = true;
        
        while(flag){
            System.out.println("\t\tInventory Record");
            System.out.println("1. Add Item");
            System.out.println("2. View all Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Item");
            System.out.println("5. Delete Item");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Item No: ");
                    itemNo[count] = sc.nextInt();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Item Name: ");
                    itemName[count] = sc.nextLine();
    
                    System.out.print("Enter Price: ");
                    price[count] = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();
    
                    count++;
                    System.out.println("Item added Successfully!");
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("No Item Found!");
                    }else{
                        System.out.println("Item Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Item No: " + itemNo[i]);
                            System.out.println("Item Name: " + itemName[i]);
                            System.out.println("Price: " + price[i]);
                            System.out.println("Quantity: " + quantity[i]);

                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter Item No to search:");
                    int search = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(itemNo[i] == search){
                            System.out.println("Item Found.");
                            System.out.println("Item No: " + itemNo[i]);
                            System.out.println("Item Name: " + itemName[i]);
                            System.out.println("Price: " + price[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("ERROR : Item not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Item No to be updated: ");
                    int update = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(itemNo[i] == update){
                            sc.nextLine();
                            System.out.println("Enter New Item Name: ");
                            itemName[i] = sc.nextLine();

                            System.out.println("Enter new Price: ");
                            price[i] = sc.nextDouble();

                            System.out.println("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Item updated.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("ERROR : Item not found!");
                    }
                    break;

                case 5:
                    System.out.println("Enter Item No to be deleted: ");
                    int delete = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(itemNo[i] == delete){
                            for(int j=i ; j<count-1 ; j++){
                                itemNo[j] = itemNo[j+1];
                                itemName[j] = itemName[j+1];
                                price[j] = price[j+1];
                                quantity[j] = quantity[j+1];
                            }
                            count--;
                            System.out.println("Item deleted.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("ERROR : Item not found!");
                    }
                    break;

                case 6:
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