package Strategy;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStrategy(new Coding());
        student.executeStrategy();

        student.setStrategy(new DoingHomework());
        student.executeStrategy();

        student.setStrategy(new PlayingChess());
        student.executeStrategy();
    }
}
