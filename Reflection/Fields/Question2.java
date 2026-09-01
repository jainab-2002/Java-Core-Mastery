package Reflection.Fields;
class Question2 {
    String color;
    int speed;

    public static void main(String[] args) {
        Question2 q = new Question2();
        q.color = "Red";
        q.speed = 120;

        System.out.println(q.color);
        System.out.println(q.speed);
    }
}