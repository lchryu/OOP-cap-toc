public class Teacher extends Person {
    private int salary;


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

    // da hinh - poly morphism
    public void Display() {
        super.Display();
        System.out.println("Salary: " + getSalary() + "\n");
    }
}
