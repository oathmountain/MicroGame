import GameObjects.*;
import com.googlecode.lanterna.input.Key;

public class Main {
    private static GameEngine engine;
    private static Renderer renderer;
    private static GameCharacter[] characters;
    private static boolean playerAlive;
    public static Coordinate windowMax;
    private static Map map;
    private static int score;
    public static void main(String[] args) {
        initializeGame();
        doGameLoop(engine, renderer, characters);
    }

    private static void initializeGame() {
        renderer = new Renderer();
        characters = new GameCharacter[2];
        characters[0] = new Player(5,5);
        characters[1] = new Monster(10,10, 'X');
        playerAlive = true;
        map = new Map();
        engine = new GameEngine(characters, map);
        score = 0;


    }

    private static void doGameLoop(GameEngine engine, Renderer renderer, GameCharacter[] characters) {
        renderer.render(characters);
        renderer.renderMap(map);
        while(playerAlive){
            Key key;

            key = renderer.getTerminal().readInput();
            if(key != null){
                try {
                    Thread.sleep(10);
                }catch(Exception e){
                    System.out.println("Thread is not sleeping properly!");
                }
                score++;
                playerAlive = engine.tick(key, characters);
                renderer.render(characters);
                renderer.renderMap(map);
                renderer.printText("Score: " + score, 4 , 0);
                key = null;
            }

            //System.out.println(key.getCharacter() + " " + key.getKind());
        }
        renderer.deathScreen();
    }
}