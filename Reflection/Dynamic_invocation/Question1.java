package Reflection.Dynamic_invocation;

class Question1 {
    String name;
    int age;

    Question1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Question1 q = new Question1("Jainab", 24);
        q.display();
    }
}