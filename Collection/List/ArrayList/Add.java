import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements into the array
        // Add method (1) :

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");

        //  Add method (2) :
        //  names.add(index, value);         

        names.add(1, "Lucas");

        System.out.println(names);

    }
}
