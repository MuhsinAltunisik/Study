package Day1;
import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {

        // declare ; condition ; increment/decrement

        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("happy new year");

        for(int i = 10; i >= 0; i-=2) {
            System.out.println(i);
        }

        System.out.println("happy new year");

        for(int i = 10; i >= 0;) {
            System.out.println(i);
            i-=2;
        }

        System.out.println("happy new year");


    }
}
