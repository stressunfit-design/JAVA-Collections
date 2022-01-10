import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Adding elements into the array

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");

        //Updating can be achieved through set
        //names.set(index, value)       

        names.set(2, "Harry");

        System.out.println(names);

    }
}
