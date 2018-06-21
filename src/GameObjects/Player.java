package GameObjects;

import com.googlecode.lanterna.input.Key;

public class Player extends GameCharacter {
    public Player(int x, int y) {
        super(x, y, 'O');
    }


    public void moveTo(Key key) {
        if(key.getKind() == Key.Kind.ArrowDown)
            y++;
        else if(key.getKind() == Key.Kind.ArrowUp)
            y--;
        else if(key.getKind() == Key.Kind.ArrowLeft)
            x--;
        else if(key.getKind() == Key.Kind.ArrowRight)
            x++;
    }
}
