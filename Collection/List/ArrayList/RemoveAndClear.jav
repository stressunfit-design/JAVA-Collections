import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Josh");
        names.add("Ella");
        names.add("Rita");
        
       //Remove method (1):
       //names.remove(index);
       
        names.remove(1);
        
        
        //Remove method (2):
        //names.remove(Datatype.valueOf( value ))

        names.remove(String.valueOf("Josh"));
        
        System.out.println(names);

    }
}
