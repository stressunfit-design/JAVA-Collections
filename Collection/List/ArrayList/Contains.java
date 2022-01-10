import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements into the array

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");

        // Contains:
        // Returns Boolean Value.       

        System.out.println(names.contains("Rita"));

    }
}
