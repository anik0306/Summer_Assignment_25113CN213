import java.util.Scanner;

public class miniLibrarySystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] bookID = new int[100];
        String[] bookName = new String[100];
        String[] authorName = new String[100];
        boolean[] isBorrowed = new boolean[100];

        boolean flag = true;
        int count = 0;
        
        while(flag){
            System.out.println("\t\tBooks Record");
            System.out.println("1. Add New Book.");
            System.out.println("2. View All Books");
            System.out.println("3. Book Issued");
            System.out.println("4. Book Returned");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookID[count] = sc.nextInt();
                    sc.nextLine();     //buffer

                    System.out.print("Enter book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    authorName[count] = sc.nextLine();

                    isBorrowed[count] = false;
    
                    count++;
                    System.out.println("Book added Successfully!");
                    break;

                case 2:
                    if(count == 0){
                        System.out.println("No Book Found!");
                    }else{
                        System.out.println("Books Record:");
                        for(int i=0 ; i<count ; i++){
                            System.out.println("Book ID: " + bookID[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author Name: " + authorName[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter book ID to borrow: ");
                    int borrow = sc.nextInt();
                    boolean isfound = false;
                    
                    for(int i=0 ; i<count ; i++){
                        if(bookID[i] == borrow){
                            System.out.println("Book ID: " + bookID[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author Name: " + authorName[i]);

                            if(isBorrowed[i]){
                                System.out.println("ERROR : This book is already borrowed! ");
                            }else{
                                isBorrowed[i] = true;
                                System.out.println("Success : You have borrowed this book. ");
                            }
                            isfound = true;
                            break;
                        }
                    }

                    if(!isfound){
                        System.out.println("ERROR : Book not found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Book ID to return: ");
                    int returns = sc.nextInt();
                    isfound = false;

                    for(int i=0 ; i<count ; i++){
                        if(bookID[i] == returns){
                            System.out.println("Book ID: " + bookID[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author Name: " + authorName[i]);

                            if(isBorrowed[i]){
                                isBorrowed[i] = false;
                                System.out.println("Success : Book was returned successfully. ");
                            }else{
                                System.out.println("ERROR : This book was not borrowed by anyone! ");
                            }
                            isfound = true;
                            break;
                        }
                    }
                    if(!isfound){
                        System.out.println("ERROR : Book not found!");
                    }
                    break;

                case 5:
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
