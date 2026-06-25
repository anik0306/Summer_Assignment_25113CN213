import java.util.Scanner;
public class marksheetGeneration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[100];
        String[] name = new String[100];
        double[] marks1 = new double[100];
        double[] marks2 = new double[100];
        double[] marks3 = new double[100];

        int count = 0;
        
        while(true){
            System.out.println("\t\tMarksheet Generation");
            System.out.println("1. Add Student");
            System.out.println("2. Generate Marksheet");
            System.out.println("3. Display all Students");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Roll No: ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine();     //buffer
                    
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();
    
                    System.out.print("Enter Marks in Subject 1: ");
                    marks1[count] = sc.nextDouble();

                    System.out.print("Enter Marks in Subject 2: ");
                    marks2[count] = sc.nextDouble();

                    System.out.print("Enter Marks in Subject 3: ");
                    marks3[count] = sc.nextDouble();
    
                    count++;
                    System.out.println("Student added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter student's Roll No to search:");
                    int search = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(rollNo[i] == search){
                            double total = marks1[i] + marks2[i] + marks3[i];
                            double percentage = total/3.0;

                            String grade;

                            if(percentage >= 90){
                                grade = "A+";
                            }else if(percentage >= 85){
                                grade = "A";
                            }else if(percentage >= 75){
                                grade = "B";
                            }else if(percentage >= 60){
                                grade = "C";
                            }else if(percentage >= 40){
                                grade = "D";
                            }else{
                                grade = "F";
                            }

                            System.out.println("\t\tMARKSHEET");
                            System.out.println("Roll No    : " + rollNo[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Subject 1  : " + marks1[i]);
                            System.out.println("Subject 2  : " + marks2[i]);
                            System.out.println("Subject 3  : " + marks3[i]);
                            System.out.println("Total      : " + total);
                            System.out.println("Percentage : " + percentage);
                            System.out.println("Grade      : " + grade);

                            found = true;
                            break;
                        }  
                    }    
                    if(!found){
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    if(count == 0){
                        System.out.println("No Record Found!");
                    }else{
                        System.out.println("Students Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Exit");
                    break;    

            }
        }
    }        
}
