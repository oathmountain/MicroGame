package GameObjects;

import com.googlecode.lanterna.terminal.Terminal;

public abstract class GameCharacter {
    protected int x, y;
    private char symbol;
    private Terminal.Color color;

    public GameCharacter(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public Terminal.Color getColor() {
        return color;
    }

    public void moveTo(int x, int y) {
<<<<<<< HEAD
        this.x = x;
        this.y = y;
=======
        this.x += x;
        this.y += y;
>>>>>>> 2572408ddcbe46c2328f00330de3976f51148591
    }

    public char getSymbol() {
        return symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
