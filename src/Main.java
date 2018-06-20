import GameObjects.GameCharacter;
import GameObjects.Player;

public class Main {
    public static void main(String[] args) {
        InputListener input = new InputListener();
        GameEngine engine = new GameEngine();
        GameCharacter[] characters = new GameCharacter[1];
        characters[0] = new Player();
    }
}