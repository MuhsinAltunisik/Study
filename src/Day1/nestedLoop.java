package Day1;
import java.util.Scanner;

public class nestedLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int coloumns;
        String symbol = "";
        System.out.println("Enter # of rows: ");
        rows= scanner.nextInt();
        System.out.println("Enter # of coloumns: ");
        coloumns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int j=1; j<=coloumns; j++) {
                System.out.print(symbol);
            }

        }

    }
}
