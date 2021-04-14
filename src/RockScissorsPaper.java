import java.util.*;

public class RockScissorsPaper {
    final double win_rate = 0.2;
    double now_rate = 1.0;
    int player_hand;
    int cpu_hand;

    public void getPlayerInput() {
        System.out.println("出す手を選択してください");
        System.out.println("1:グー\n2:チョキ\n3:パー");
        Scanner scanner = new Scanner(System.in);
        try {       
            this.player_hand = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("UnKnown Error");
            scanner.close();
            getPlayerInput();
        }
        scanner.close();
    }

    public void decide_final_cpu_hand() {
        while(this.now_rate >= this.win_rate) {
            int temporary_cpu_hand = new Random().nextInt(3);
            if (!is_player_win(this.player_hand, temporary_cpu_hand)) {
                this.cpu_hand = temporary_cpu_hand;
                break;
            }
            this.now_rate *= win_rate;
        }
    }

    public boolean is_player_win(int player_hand, int cpu_hand) {
        if (cpu_hand == 1 && player_hand == 3) {
            return true;
        }

        if (cpu_hand > player_hand) {
            return true;
        }

        return false;
    }
}
