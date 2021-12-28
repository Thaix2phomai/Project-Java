package service.join;

import player.Position;

public class Player {
    private int number;
    private String fullname;
    private Position position;

    public Player(int number, String fullname, Position position) {
        this.number = number;
        this.fullname = fullname;
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public String getFullname() {
        return fullname;
    }

    public Position getPosition() {
        return position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", fullname='" + fullname + '\'' +
                ", position=" + position +
                '}';
    }
}
