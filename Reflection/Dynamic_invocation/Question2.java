package Reflection.Dynamic_invocation;

class Question2 {
    String name;
    int age;

    Question2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Question2 q = new Question2("Jainab", 24);
        q.display();
    }
}