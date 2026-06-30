import java.util.Scanner;

public class miniEmployeeManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] empID = new int[100];
        String[] empName = new String[100];
        double[] empSalary = new double[100];
        int count = 0;
        boolean flag = true;
        
        while(flag){
            System.out.println("\t\tEmployee Record");
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee's");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empID[count] = sc.nextInt();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();
    
                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();
    
                    count++;
                    System.out.println("Employee added Successfully!");
                    
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("No Record Found!");
                    }else{
                        System.out.println("Employee Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Employee ID: " + empID[i]);
                            System.out.println("Employee Name: " + empName[i]);
                            System.out.println("Employee Salary: " + empSalary[i]);
                        }
                    }
                    break;
                        
                case 3:
                    System.out.println("Enter Employee ID No to search:");
                    int search = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(empID[i] == search){
                            System.out.println("Record Found.");
                            System.out.println("Employee ID: " + search);
                            System.out.println("Employee Name: " + empName[i]);
                            System.out.println("Employee Salary: " + empSalary[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
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
