package Reflection.Annotations;

public class Question2 {

    @Deprecated
    void oldMethod() {
        System.out.println("This is an old method");
    }

    public static void main(String[] args) {
        Question2 q = new Question2();
        q.oldMethod();
    }
}