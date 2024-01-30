package Day1;
import java.util.ArrayList;
public class arrayList {

        public static void main(String[] args) {


            ArrayList<String> food = new ArrayList<>();

            food.add("pizza");
            food.add("hamburger");
            food.add("hot dog");

            food.set(0, "sushi");
            food.remove(2);
            //food.clear();

            for (String s : food) {
                System.out.println(s);
            }

        }
}
