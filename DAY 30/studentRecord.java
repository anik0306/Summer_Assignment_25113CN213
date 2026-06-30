import java.util.Scanner;

public class studentRecord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        double[] marks = new double[100];
        int count = 0;
        boolean flag = true;
        
        while(flag){
            System.out.println("\t\tStudent Record");
            System.out.println("1. Add Student");
            System.out.println("2. View all Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();
    
                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();
    
                    count++;
                    System.out.println("Student added Successfully!");
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("No Record Found!");
                    }else{
                        System.out.println("Students Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);

                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter student's Roll No to search:");
                    int search = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(rollNo[i] == search){
                            System.out.println("Record Found.");
                            System.out.println("Roll No: " + search);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Roll No to be updated: ");
                    int update = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(rollNo[i] == update){
                            sc.nextLine();
                            System.out.println("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.println("Enter new Marks: ");
                            marks[i] = sc.nextDouble();

                            System.out.println("Record updated.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter Roll No to be deleted: ");
                    int delete = sc.nextInt();
                    found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(rollNo[i] == delete){
                            for(int j=i ; j<count-1 ; j++){
                                rollNo[j] = rollNo[j+1];
                                name[j] = name[j+1];
                                marks[j] = marks[j+1];
                            }
                            count--;
                            System.out.println("Record deleted.");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student not found.");
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
