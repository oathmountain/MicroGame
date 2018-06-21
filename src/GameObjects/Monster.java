package GameObjects;

public class Monster extends GameCharacter {
<<<<<<< HEAD

=======
    private int counter;
    private int delay = 6;
    public Monster(int x, int y, char symbol) {
        super(x, y, symbol);
    }

    public void moveTowards(Coordinate location){
        if(counter == 0) {
            if (coordinate.getX() < location.getX()) {
                moveTo(1, 0);
            } else if (coordinate.getX() > location.getX()) {
                moveTo(-1, 0);
            } else if (coordinate.getY() < location.getY()) {
                moveTo(0, 1);
            } else {
                moveTo(0, -1);
            }
            counter = delay;
        }else{
            counter--;
        }

    }
>>>>>>> ade9751ab43c5ad72c0e8836f80492157854d0ac
}
