import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class arrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2 , 5 , 3 , 6 , 4};
        ArrayList<Integer> list = new ArrayList<>();

        for(int ele : arr){
            list.add(ele);
        }

        boolean flag = true;
        int sum = 0;

        while(flag){
            System.out.println("\t\tArray Operations");
            System.out.println("1. Add element in Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search an Element");
            System.out.println("4. Calculate Sum of Elements");
            System.out.println("5. Sort Array");
            System.out.println("6. Exit");

            System.out.println("Enter Your Choice: ");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("Enter the element to add in array");
                    int addNo = sc.nextInt();
                    list.add(addNo);
                    System.out.println("Element added successfully.");
                    break;

                case 2:
                    System.out.println(list);
                    break;
                    
                case 3:
                    System.out.println("Enter the element to be search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for(int i=0 ; i<list.size() ; i++){
                        if(list.get(i) == search){
                            System.out.println("Element " + search + " found at index " + i);
                            found = true;
                            break;
                        }  
                    }

                    if(!found){
                        System.out.println("ERROR : Element not found!");
                    }
                    break;

                case 4:
                    for(int x : list){
                        sum += x;
                    }
                    System.out.println("Sum of Elements: " + sum);
                    break;

                case 5:
                    System.out.println("Sorted Array is: ");
                    Collections.sort(list);
                    System.out.println(list);
                    break;

                case 6:
                    System.out.println("!!THANK YOU!!\nExiting...");
                    flag = false;
                    break;   
                        
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }

        }

    }
    
}
