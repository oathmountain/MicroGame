import GameObjects.GameCharacter;
import GameObjects.Monster;
import GameObjects.Player;
import com.googlecode.lanterna.input.Key;

public class Main {
    private static GameEngine engine;
    private static Renderer renderer;
    private static GameCharacter[] characters;
    private static boolean playerAlive;
    public static void main(String[] args) {
        initializeGame();
        doGameLoop(engine, renderer, characters);
    }

    private static void initializeGame() {
        engine = new GameEngine();
        renderer = new Renderer();
        characters = new GameCharacter[2];
        characters[0] = new Player(5,5);
        characters[1] = new Monster(10,10, 'X');
        playerAlive = true;
    }

    private static void doGameLoop(GameEngine engine, Renderer renderer, GameCharacter[] characters) {
        while(playerAlive){
            Key key;

            key = renderer.getTerminal().readInput();
            if(key != null){
                try {
                    Thread.sleep(10);
                }catch(Exception e){
                    System.out.println("Thread is not sleeping properly!");
                }
                playerAlive = engine.tick(key, characters);
                renderer.render(characters);
                key = null;
            }

            //System.out.println(key.getCharacter() + " " + key.getKind());
        }
        System.out.println("NOOOO du doooog");
    }
}