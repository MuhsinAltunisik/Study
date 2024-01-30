package Day1;
import java.util.Scanner;

public class logicalOperations {

    public static void main(String[] args) {

        // && = (AND)
        // !! = (OR)
        // !  = (NOT) reverses boolean value of a condition

        int temp = 13;
        if(temp>35) {
            System.out.println("it is hot outside.");
        }
        else if(temp >=20 && temp <=30){
            System.out.println("it is warm outside.");
        }
        else {
            System.out.println("it is cold outside.");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")) {

            System.out.println("You are still playing.");

        }
        else {
            System.out.println("you quit the game");
        }

		/*if (response.equals("q") || response.equals("Q")) {

			System.out.println("you quit the game");

		}
		else {
			System.out.println("You are still playing.");
		}
		*/


    }
}
