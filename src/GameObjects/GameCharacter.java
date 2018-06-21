package GameObjects;

import com.googlecode.lanterna.terminal.Terminal;

public abstract class GameCharacter {
    protected Coordinate coordinate;
    private char symbol;
    private Terminal.Color color;

    public GameCharacter(int x, int y, char symbol) {
        coordinate = new Coordinate(x,y);
        this.symbol = symbol;
    }

    public Terminal.Color getColor() {
        return color;
    }

    public void moveTo(int x, int y) {
        coordinate.move(x, y);
    }//Coordinate temp = new Coordinate(coordinate.getX()+x, coordinate.getY() +y);

    public char getSymbol() {
        return symbol;
    }

    protected boolean coordinateIsWall(Coordinate coordinate){
        return GameEngine.map.getMap()[coordinate.getX()][coordinate.getY()];
    }

    public int getX() {
        return coordinate.getX();
    }

    public int getY() {
        return coordinate.getY();
    }
    public Coordinate getCoordinate(){
        return coordinate;
    }
}
