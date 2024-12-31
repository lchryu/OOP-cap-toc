import java.util.Scanner;

class Person{
    private String name;
    private int dob;
    Scanner sc = new Scanner(System.in);


    public Person() {
    }

    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDob() {
        return dob;
    }
    public void setDob(int dob) {
        this.dob = dob;
    }
    public void Input() {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Dob: ");
        dob = sc.nextInt();
    }


    // override lai cai method display cua person
    public void Display() {
        System.out.println("Name: " + this.name + "\n" + "dob: " + this.dob);
    }
}
