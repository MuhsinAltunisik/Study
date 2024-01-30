package Day1;

public class ifStatement {

    public static void main(String[] args) {

        int age = 19;

        //correct == not = for comparison

        if(age>=75) {
            System.out.println("ok boomer");
        }
        else if (age>=18) {
            System.out.println("you are an adult");
        }
        else if (age>=13) {
            System.out.println("you are a teenager");
        }
        else {
            System.out.println("you are not an adult");
        }
    }
}
