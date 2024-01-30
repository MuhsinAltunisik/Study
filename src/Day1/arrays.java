package Day1;

public class arrays {

    public static void main(String[] args) {

        String[] cars = {"Camaro", "Corvette", "Tesla"};
        int[] numbers = {1, 2, 3};

        cars[0] = "Mustang";

        System.out.println(cars[1]);
        System.out.println(numbers[1]);

        String[] car = new String[3];
        car[0]= "A";
        car[1]= "B";
        car[2]= "C";

        for(int i=0; i<car.length; i++) {
            System.out.println(car[i]);

        }
    }
}
