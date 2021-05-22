package Exam8;

public class Main {
    public static void main(String[] args) {
        Cleric priest = new Exam8.Cleric();
        priest.name = "priest A";
        for (int i = 0; i < 3; i++) {
            priest.selfAid();
        }
        priest.pray(3);
    }
}
