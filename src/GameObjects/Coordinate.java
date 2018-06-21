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
        if(this.x + x < 1){
            this.x = 1;
        }
        if(this.y + y < 1){
            this.y = 1;
        }
        this.x += x;
        this.y += y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Coordinate other = (Coordinate)obj;
        if(x == other.getX() && y == other.getY()){
            return true;
        }
        return false;
    }
}
