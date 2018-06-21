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

    private boolean checkCoordinate(Coordinate coordinate){
        if(GameEngine.gameObjects[coordinate.getX()][coordinate.getY()] != 0){
            return true;
        }else{
            return false;
        }
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
