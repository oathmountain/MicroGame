package GameObjects;

import com.googlecode.lanterna.input.Key;

public class Player extends GameCharacter {
    public Player(int x, int y) {
        super(x, y, 'O');
    }


    public void moveTo(Key key) {
        if(key.getKind() == Key.Kind.ArrowDown && !coordinateIsWall(new Coordinate(getX(),getY()+1)))
            moveTo(0,1);
        else if(key.getKind() == Key.Kind.ArrowUp && !coordinateIsWall(new Coordinate(getX(),getY()-1)))
            moveTo(0,-1);
        else if(key.getKind() == Key.Kind.ArrowLeft && !coordinateIsWall(new Coordinate(getX()-1,getY())))
            moveTo(-1,0);
        else if(key.getKind() == Key.Kind.ArrowRight && !coordinateIsWall(new Coordinate(getX()+1,getY())))
            moveTo(1,0);
    }
}
