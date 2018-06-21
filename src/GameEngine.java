import GameObjects.GameCharacter;
import GameObjects.Player;
import com.googlecode.lanterna.input.Key;


public class GameEngine {
    public void tick(Key key, GameCharacter[] characters) {

        if (checkKey(key)) {
            Player player = (Player) characters[0];
            player.moveTo(key);
        }
    }

    private boolean checkKey(Key key) {
        if (key != null && (key.getKind() == Key.Kind.ArrowDown ||
                key.getKind() == Key.Kind.ArrowLeft ||
                key.getKind() == Key.Kind.ArrowUp ||
                key.getKind() == Key.Kind.ArrowRight)) {
            return true;
        }
        return false;
    }
}
