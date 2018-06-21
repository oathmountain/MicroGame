import GameObjects.GameCharacter;
import GameObjects.Monster;
import GameObjects.Player;
import com.googlecode.lanterna.input.Key;


public class GameEngine {
    public boolean tick(Key key, GameCharacter[] characters) {
        Player player = (Player) characters[0];
        if (checkKey(key)) {

            player.moveTo(key);
        }
        for(int i = 1; i < characters.length; i++){
            ((Monster)characters[i]).moveTowards(player.getCoordinate());
        }
        return checkDeath(characters);
    }

    private boolean checkDeath(GameCharacter[] characters) {
        for(int i = 1; i < characters.length;i++){
            if(characters[0].getCoordinate().equals(characters[i].getCoordinate())){
                return false;
            }
        }
        return true;
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
