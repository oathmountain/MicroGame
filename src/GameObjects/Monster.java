package GameObjects;

public class Monster extends GameCharacter {

    private int counter;
    private int delay;
    public Monster(int x, int y, char symbol, int delay) {
        super(x, y, symbol);
        this.delay = delay;
    }

    public void moveTowards(Coordinate location){
        if(counter == 0) {
            int diffX = coordinate.getX() - location.getX();
            int diffY = coordinate.getY() - location.getY();

            //if X differences is bigger than Y difference to player, and that X is not a wall
            if(Math.abs(diffX) > Math.abs(diffY) && !coordinateIsWall(new Coordinate(coordinate.getX() +(diffX >0?-1:1),coordinate.getY()))){
                moveTo(diffX > 0 ? -1 : 1, 0);
            }
            //If Y difference is bigger, and that Y is not a wall
            else if(!coordinateIsWall(new Coordinate(coordinate.getX(),coordinate.getY() + (diffY > 0 ? -1 : 1)))){
                moveTo(0,diffY > 0 ? -1 : 1);
            }
            //if none above, is the other X a wall?
            else if( !coordinateIsWall(new Coordinate(coordinate.getX() -(diffX >0?-1:1),coordinate.getY()))){
                moveTo(diffX > 0 ? -1 : 1, 0);
            }
            //if it was, move the other Y
            else{
                moveTo(0,diffY > 0 ? -1 : 1);
            }

            counter = delay;
        }else {
            counter--;
        }
    }
}
