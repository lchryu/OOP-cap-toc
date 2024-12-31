import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();


        // type variable - ref = value
        // int a = 5
        Person p1 = new Teacher("Long", 1999, 2000);
        Person p2 = new Student("John", 1999, 3.2);
        list.add(p1);
        list.add(p2);

        // person nay la Student hay Teacher -> call -> Display()
        for (Person person : list) {
            person.Display();
        }

    }
}