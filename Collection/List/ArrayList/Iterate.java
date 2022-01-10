import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements into the array

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");

        // Method (1):
        // For Loop:

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println();

        //---------------------------------------------------


        // Method (2):
        // For each Loop:

        for (String name : names){
            System.out.println(name);
        }

        System.out.println();

        //---------------------------------------------------


        // Method (3):
        // Iterator:

        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
