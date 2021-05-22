package Exam8;

import Exam8.Cleric.*;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane("魔法の杖", 100, 5);
        Cleric priest = new Cleric("priest A", cane, 500, 100);

        priest.selfAid();
        priest.pray(3);
    }
}
