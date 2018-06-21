package GameObjects;

public class Monster extends GameCharacter {

    private int counter;
    private int delay = 5;
    public Monster(int x, int y) {
        super(x, y, '\u263a');
    }

    public void moveTowards(Coordinate location){
        if(counter == 0) {
            int diffX = coordinate.getX() - location.getX();
            int diffY = coordinate.getY() - location.getY();
            if(Math.abs(diffX) > Math.abs(diffY) && !coordinateIsWall(new Coordinate(coordinate.getX() +(diffX >0?-1:1),coordinate.getY()))) {
                moveTo(diffX > 0 ? -1 : 1, 0);
            } else if(!coordinateIsWall(new Coordinate(coordinate.getX(),coordinate.getY() + (diffY > 0 ? -1 : 1)))){
                moveTo(0,diffY > 0 ? -1 : 1);
            }else if( !coordinateIsWall(new Coordinate(coordinate.getX() -(diffX >0?-1:1),coordinate.getY()))){
                moveTo(diffX > 0 ? -1 : 1, 0);
            }else{
                moveTo(0,diffY > 0 ? -1 : 1);
            }

            counter = delay;
        }else {
            counter--;
        }
    }
}
