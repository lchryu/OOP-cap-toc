import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);
// 1. data from input
//        System.out.print("Enter the number of people: ");
//        int n = Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            // init
//            Person p;
//
//            System.out.println("Student/Teacher - 0/1");
//            int k = Integer.parseInt(sc.nextLine());
//            // value
//            if (k == 0) p = new Student();
//            else p = new Teacher();
//
//            p.Input();
//        }

        // 2. fake data test cho nhanh
        people.add(new Student("Long", 1990, 3.2));
        people.add(new Student("Phong", 2024, 3.2));
        people.add(new Teacher("Linh", 1975, 1000));



        Collections.sort(people, (o1, o2) -> o2.getDob() - o1.getDob());

//        for (int i = 0; i < people.size() - 1; i++) {
//            for (int j = i + 1; j < people.size(); j++) {
//                if (people.get(i).getDob() > people.get(j).getDob()) {
//                    Person temp = people.get(i);
//                    people.set(i, people.get(j));
//                    people.set(j, temp);
//                }
//            }
//        }

        for (Person p : people) {
            p.Display();
        }

    }
}