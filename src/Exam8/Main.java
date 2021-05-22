package Exam8;

import Exam8.Cleric.*;

public class Main {
    public static void main(String[] args) {
        Cleric priest = new Cleric();

        Cane cane = new Cane();
        cane.setName("魔法の杖");
        cane.setInteger(100);
        cane.setAdditionalEfect(5);

        priest.name = "priest A";
        priest.cane = cane;

        priest.selfAid();
        priest.pray(3);
    }
}
