package GameObjects;

public class Monster extends GameCharacter {

    private int counter;
    private int delay = 5;
    public Monster(int x, int y, char symbol) {
        super(x, y, symbol);
    }

    public void moveTowards(Coordinate location){
        if(counter == 0) {
            int diffX = coordinate.getX() - location.getX();
            int diffY = coordinate.getY() - location.getY();

            if(Math.abs(diffX) > Math.abs(diffY)) {
                moveTo(diffX > 0 ? -1 : 1, 0);
            } else {
                moveTo(0,diffY > 0 ? -1 : 1);
            }

            counter = delay;
        }else{
            counter--;
        }
    }
}
