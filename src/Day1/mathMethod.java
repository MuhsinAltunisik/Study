package Day1;
import java.util.Scanner;

public class mathMethod {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double t = Math.min(x, y);
        double u = Math.abs(y);
        double k = Math.sqrt(u);
        double l = Math.round(x);
        double m = Math.ceil(x);
        double n = Math.floor(x);

        System.out.println(z + " " +t+ " " +u+ " " +k+ " " +l+ " " +m+ " " +n);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter side a: ");
        a= scanner.nextDouble();

        System.out.println("enter side b: ");
        b= scanner.nextDouble();

        c= Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is : "+c);

        scanner.close();



    }
}
