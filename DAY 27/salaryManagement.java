import java.util.Scanner;
public class salaryManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] empID = new int[100];
        String[] empName = new String[100];
        double[] empSalary = new double[100];
        int count = 0;
        
        while(true){
            System.out.println("\t\tSalary Record");
            System.out.println("1. Add Salary Record");
            System.out.println("2. Display all Records");
            System.out.println("3. Search Salary");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empID[count] = sc.nextInt();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();
    
                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();
    
                    count++;
                    System.out.println("Record added Successfully!");
                    
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("No Record Found!");
                    }else{
                        System.out.println("Salary Record:");
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
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;    

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }
    }        
}
