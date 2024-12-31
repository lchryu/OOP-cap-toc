import java.util.Scanner;

public class Teacher extends Person {
    private int salary;
    Scanner sc = new Scanner(System.in);
    public Teacher() {
    }



    public Teacher(String name, int dob, int salary) {
        super(name, dob);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Input() {
        super.Input();
        System.out.print("Salary: ");
        salary = sc.nextInt();
    }
    // da hinh - poly morphism
    public void Display() {
        super.Display();
        System.out.println("Salary: " + getSalary() + "\n");
    }
}
