import GameObjects.GameCharacter;
import GameObjects.Player;
import com.googlecode.lanterna.input.Key;

public class Main {
    private static GameEngine engine;
    private static Renderer renderer;
    private static GameCharacter[] characters;
    public static void main(String[] args) {
        initializeGame();
        doGameLoop(engine, renderer, characters);
    }

    private static void initializeGame() {
        engine = new GameEngine();
        renderer = new Renderer();
        characters = new GameCharacter[1];
        characters[0] = new Player(5,5);
    }

    private static void doGameLoop(GameEngine engine, Renderer renderer, GameCharacter[] characters) {
        while(true){
            Key key;
            do{
                try {
                    Thread.sleep(5);
                }catch(Exception e){
                    System.out.println("Thread is not sleeping properly!");
                }
                key = renderer.getTerminal().readInput();
                engine.tick(key, characters);
                renderer.render(characters);
            }while(key == null);

            System.out.println(key.getCharacter() + " " + key.getKind());
        }
    }
}