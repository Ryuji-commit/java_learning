package Exam8;
import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    public void selfAid() {
        if (this.mp < 5) {
            System.out.println("MPが足りません！");
            return;
        }
        this.mp -= 5;
        this.hp += MAX_HP;
        System.out.println(this.name + "の体力が完全回復!");
    }

    public int pray(int seconds) {
        System.out.println(this.name + "は" + seconds + "秒間祈った!");
        int logicallyRecover = seconds + new Random().nextInt(3);
        int recoveredMp = Math.min(this.MAX_MP - this.mp, logicallyRecover);
        this.mp += recoveredMp;
        System.out.println("MPが" + recoveredMp + "回復!");
        return recoveredMp;
    }
}