import java.util.Scanner;
public class ticketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] originName = new String[100];
        String[] destinationName = new String[100];
        int[] ticketNo = new int[100];
        int[] seats = new int[100];
        String[] name = new String[100];
        String[] passengerName = new String[100];

        boolean flag = true;
        int count = 0;

        while(flag){
            System.out.println("\t\tTicket Booking");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Booked Ticket");
            System.out.println("3. Update Ticket");
            System.out.println("4. Cencel Ticket");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Origin: ");
                    originName[count] = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destinationName[count] = sc.nextLine();

                    System.out.print("Enter Passenger name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter no of seats to book: ");
                    seats[count] = sc.nextInt();

                    System.out.println("Tickets booked Successfully!!");

                    ticketNo[count] = count + 1;
                    count++;
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("ERROR : No Ticket booked!");
                    }else{
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Ticket no: " + ticketNo[i]);
                            System.out.println("Origin: " + originName[i]);    
                            System.out.println("Destination: " + destinationName[i]);    
                            System.out.println("Passenger name: " + name[i]);    
                            System.out.println("No of seats booked: " + seats[i]);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter ticket No to be updated: ");
                    int update = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(ticketNo[i] == update){
                            sc.nextLine();
                            System.out.print("Enter New Origin: ");
                            originName[i] = sc.nextLine();
        
                            System.out.print("Enter New Destination: ");
                            destinationName[i] = sc.nextLine();
        
                            System.out.print("Enter new Passenger name: ");
                            name[i] = sc.nextLine();
        
                            System.out.print("Enter no of seats to book: ");
                            seats[i] = sc.nextInt();

                            System.out.println("Ticket updated.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Ticket No not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Ticket No to be cencel: ");
                    int cencel = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(ticketNo[i] == cencel){
                            for(int j=i ; j<count-1 ; j++){
                                ticketNo[j] = ticketNo[j+1];
                                name[j] = name[j+1];
                                originName[j] = originName[j+1];
                                destinationName[j] = destinationName[j+1];
                                seats[j] = seats[j+1];
                            }    
                            count--;
                            System.out.println("Ticket Cenceled.");
                            found = true;
                            break;   
                        }
                    }

                    if(!found){
                        System.out.println("Ticket No not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for visiting.");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;

            }

        }

    }
}
