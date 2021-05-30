package Exam13;

import Exam13.Character.*;
import Exam13.Character.Character;
import Exam13.Weapon.*;

public class Main {
    public static void main(String args[]) {
        Wand wand = new Wand("魔法の杖", 10, 10, 90);
        Character[] party = new Character[3];
        party[0] = new Hero("勇者A", 100, 50);
        party[1] = new Wizard("魔法使いA", 80, 100);
        party[2] = new Wizard("魔法使いB", 50, 200);

        party[2].attack();
        
        if (party[2] instanceof Wizard) {
            Wizard wizB = (Wizard)party[2];
            wizB.setWeapon(wand);
            wizB.attack();
            wizB.heal(party[0]);
            wizB.heal(party[1]);
        }
    }
}
