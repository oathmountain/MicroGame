package GameObjects;

import com.googlecode.lanterna.terminal.Terminal;

public abstract class GameCharacter {
    private int x,y;
    private char symbol;
    private Terminal.Color color;
    public GameCharacter(){

    }

    public Terminal.Color getColor() {
        return color;
    }

    public void moveTo(int x, int y){

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
