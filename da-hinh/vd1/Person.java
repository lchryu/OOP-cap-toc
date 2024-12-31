class Person{
    private String name;
    private int dob;

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

    // override lai cai method display cua person
    public void Display() {
        System.out.println("Name: " + this.name + "\n" + "dob: " + this.dob);
    }
}
