import GameObjects.GameCharacter;
import GameObjects.Player;
import com.googlecode.lanterna.input.Key;

public class Main {
    public static void main(String[] args) {
        GameEngine engine = new GameEngine();
        Renderer renderer = new Renderer();
        GameCharacter[] characters = new GameCharacter[1];
        characters[0] = new Player();

        while(true){
            Key key;
            do{
                Thread.sleep(5);
                key = render.getTerminal.readInput();
            }while(key == null);
        }
    }
}