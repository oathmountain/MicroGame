package GameObjects;

public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
