package player;

import service.join.Player;

import java.util.ArrayList;

public class AddPlayer {
    public static ArrayList<Player> getPlayer () {
        ArrayList<Player> listPlayer = new ArrayList<>();
        listPlayer.add(new Player(1, "Đặng Văn Lâm", Position.GK));
        listPlayer.add(new Player(2, "Bùi Tấn Trường", Position.GK));
        listPlayer.add(new Player(3, "Quế Ngọc Hải", Position.DF));
        listPlayer.add(new Player(5, "Đoàn Văn Hậu", Position.DF));
        listPlayer.add(new Player(28, "Đỗ Duy Mạnh", Position.DF));
        listPlayer.add(new Player(21, "Trần Đình Trọng", Position.DF));
        listPlayer.add(new Player(19, "Nguyễn Quang Hải", Position.MF));
        listPlayer.add(new Player(6, "Lương Xuân Trường", Position.MF));
        listPlayer.add(new Player(11, "Nguyễn Tuấn Anh", Position.MF));
        listPlayer.add(new Player(8, "Nguyễn Trọng Hoàng", Position.MF));
        listPlayer.add(new Player(14, "Nguyễn Hoàng Đức", Position.MF));
        listPlayer.add(new Player(15, "Phạm Đức Huy", Position.MF));
        listPlayer.add(new Player(17, "Vũ Văn Thanh", Position.MF));
        listPlayer.add(new Player(20, "Phan Văn Đức", Position.MF));
        listPlayer.add(new Player(4, "Hồ Tấn Tài", Position.DF));
        listPlayer.add(new Player(93, "Nguyễn Thanh Bình", Position.DF));
        listPlayer.add(new Player(16, "Trần Minh Vương", Position.MF));
        listPlayer.add(new Player(10, "Nguyễn Công Phượng", Position.FW));
        listPlayer.add(new Player(9, "Nguyễn Văn Toàn", Position.FW));
        listPlayer.add(new Player(22, "Nguyễn Tiến Linh", Position.FW));
        listPlayer.add(new Player(12, "Nguyễn Anh Đức", Position.FW));
        listPlayer.add(new Player(18, "Hà Đức Chinh", Position.FW));

        return listPlayer;
    }
}
