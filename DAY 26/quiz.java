import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t||Welome to the QUIZ||");

        String[] questions = {
            "Which is the largest ocean on Earth ?",
            "What is the capital of France ?",
            "How many days are there in a Leap Year?",
            "How many colours are there in a standard rainbow?"
        };

        String[][] options = {
            {"Indian Ocean","Pacific Ocean","Atlantic Ocean","Arctic Ocean"} ,
            {"Delhi","New York","Paris","Brazil"} ,
            {"366","365","361","368"} ,
            {"6","5","8","7"}
        };

        int[] correctOptions = {2 , 3 , 1 , 4};
        int score = 0;

        for(int i=0 ; i<questions.length ; i++){
            System.out.println("Q " + (i+1) + ". " + questions[i]);
            for(int j=0 ; j<4 ; j++){
                System.out.println((j+1) + ". " + options[i][j]);
            }

            System.out.println("Enter your answer:");
            int ans = sc.nextInt();

            if(ans == correctOptions[i]){
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Wrong!");
            }
        }
        System.out.println("!!Well Done!!");
        System.out.println("Your score is: " +score);
    }
    
}
