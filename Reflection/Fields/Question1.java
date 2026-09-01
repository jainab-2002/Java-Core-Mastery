package Reflection.Fields;

class Question1 {
    String name;
    int age;

    public static void main(String[] args) {
        Question1 q = new Question1();
        q.name = "Rahul";
        q.age = 20;

        System.out.println(q.name);
        System.out.println(q.age);
    }
}