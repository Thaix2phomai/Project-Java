package service.join;

import player.AddPlayer;
import service.join.Player;

import java.util.ArrayList;

public class PrintPlayer {
    public static void print() {
        ArrayList<Player> allPlayer = AddPlayer.getPlayer();
        System.out.println("Danh sách 22 cầu thủ Việt Nam: ");
        for (Player pl : allPlayer) {
            System.out.println(pl);
        }
    }
}
