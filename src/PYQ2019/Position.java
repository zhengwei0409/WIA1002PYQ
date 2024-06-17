package PYQ2019;

public class Position {
    int x;
    int y;

    public Position(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + y + "," + x + ")";
    }
}
