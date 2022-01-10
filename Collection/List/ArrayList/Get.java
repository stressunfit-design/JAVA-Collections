import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");

        //  GET :
        names.get(1);
        System.out.println(names);

    }
}
