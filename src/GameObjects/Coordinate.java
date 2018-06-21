package GameObjects;

public class Coordinate {
    private int x;
    private int y;
    private static Coordinate windowMax;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int x, int y) {
        if(!(this.x + x < 0 || this.y + y < 0 || this.x + x > windowMax.x-1 || this.y + y > windowMax.y-1)){
            this.x += x;
            this.y += y;
        }
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        windowMax = Renderer.windowMax;
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
