import java.util.Scanner;

class Student extends Person{
    private double gpa;
    Scanner sc = new Scanner(System.in);
    public Student() {
    }

    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void Input() {
        super.Input();
        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();
    }
    public void Display() {
        super.Display();
        System.out.println("GPA: " + this.gpa + "\n");
    }
}