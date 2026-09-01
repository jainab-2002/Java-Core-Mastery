package Reflection.Constructors;

class Question2 {
    String name;
    int salary;

    Question2() {
        name = "Unknown";
        salary = 0;
    }

    Question2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Question2 q1 = new Question2();
        q1.display();

        Question2 q2 = new Question2("Jainab", 50000);
        q2.display();
        q1.display();

    }


}