import java.util.Scanner;
import java.util.Random;
public class numberGussingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\t\tWelcome to the Number Guessing Game!");
        System.out.println("I am thinking a number between 1 and 100:");

        int secretNumber = random.nextInt(100)+1;
        int attempt = 0;
        boolean flag = true;

        while(flag){
            System.out.println("Enter your number:");
            int guessNumber = sc.nextInt();

            if(guessNumber > secretNumber){
                System.out.println("TOO HIGH! Try a lower number.");
                attempt++;
            }else if(guessNumber < secretNumber){
                System.out.println("TOO LOW! Try a higher number.");
                attempt++;
            }else{
                System.out.println("CONGRATULATIONS!!!!! you guessed it right.");
                System.out.println("It took you " + attempt + " attempts to find the number.");
                break;
            }
        }
    }
}
