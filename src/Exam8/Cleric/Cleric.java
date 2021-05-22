package Exam8.Cleric;
import java.util.Random;

public class Cleric {
    public String name;
    public Exam8.Cleric.Cane cane;
    int hp = 500;
    final int MAX_HP = 500;
    int mp = 100;
    final int MAX_MP = 100;

    public void selfAid() {
        if (this.mp < 10) {
            System.out.println("MPが足りません！");
            return;
        }
        this.mp -= 10;
        this.hp += MAX_HP;
        System.out.println(this.name + "の体力が完全回復!");
    }

    public int pray(int seconds) {
        System.out.println(this.name + "は" + seconds + "秒間祈った!");
        int logicallyRecover = seconds + new Random().nextInt(3) + this.cane.additionalEfectHeal;
        int recoveredMp = Math.min(this.MAX_MP - this.mp, logicallyRecover);
        this.mp += recoveredMp;
        System.out.println("MPが" + recoveredMp + "回復!");
        return recoveredMp;
    }
}