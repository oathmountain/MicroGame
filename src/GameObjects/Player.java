package GameObjects;

import com.googlecode.lanterna.input.Key;

public class Player extends GameCharacter {
    public Player(int x, int y) {
        super(x, y, 'O');
    }


    public void moveTo(Key key) {
        if(key.getKind() == Key.Kind.ArrowDown)
            moveTo(0,1);
        else if(key.getKind() == Key.Kind.ArrowUp)
            moveTo(0,-1);
        else if(key.getKind() == Key.Kind.ArrowLeft)
            moveTo(-1,0);
        else if(key.getKind() == Key.Kind.ArrowRight)
            moveTo(1,0);
    }
}
