import java.util.Scanner;
public class contactManagement { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        String[] contactNo = new String[100];
        int[] temp = new int[100];

        boolean flag = true;
        int count = 0;

        while(flag){
            System.out.println("\t\tContact Management");
            System.out.println("1. New Contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter Contact No: ");
                    contactNo[count] = sc.next();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    temp[count] = count + 1;
    
                    count++;
                    System.out.println("Contact added Successfully!");
                    break;
                case 2:
                    if(count == 0){
                    System.out.println("No Record Found!");
                    }else{
                        System.out.println("Contact Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("S No.: " + temp[i]);
                            System.out.println("Contact No: " + contactNo[i]);
                            System.out.println("Name: " + name[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter Serial No to be updated: ");
                    int update = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(temp[i] == update){
                            sc.nextLine();
                            System.out.print("Enter new Contact No: ");
                            contactNo[i] = sc.next();
                            
                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.println("Contact updated.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Serial No to be deleted: ");
                    int delete = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(temp[i] == delete){
                            for(int j=i ; j<count-1 ; j++){
                                contactNo[j] = contactNo[j+1];
                                name[j] = name[j+1];
                            }
                            count--;
                            System.out.println("Contact deleted.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Contact not found.");
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
