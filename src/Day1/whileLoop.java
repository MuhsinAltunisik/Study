package Day1;
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }
        System.out.println("Helllo " + name);

	/*  do loop executes inside first then checks while

	 	do{
			System.out.println("Enter your name: ");
			name = scanner.nextLine();

		}while(name.isBlank());
		System.out.println("Helllo " + name);
	*/

    }
}
