package Exam10;

import Exam10.Hero.*;
import Exam10.Monster.*;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 100);
        PoisonMatango a = new PoisonMatango('A');
        Matango b = new Matango('B');
        a.attack(h);
        b.attack(h);
        h.attack(a);
        a.run();
        b.run();
        h.run();
    }
}
