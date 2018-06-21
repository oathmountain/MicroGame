import GameObjects.*;
import com.googlecode.lanterna.input.Key;

import java.util.Random;

public class Main {
    private static GameEngine engine;
    private static Renderer renderer;
    private static GameCharacter[] characters;
    private static boolean playerAlive;

    private static Map map;
    private static int score;
    public static void main(String[] args) {
        initializeGame();
        doGameLoop(engine, renderer, characters);
    }

    private static void initializeGame() {
        renderer = new Renderer();
        Random rand = new Random();
        int randomInt = rand.nextInt(20);
        characters = new GameCharacter[randomInt];
        characters[0] = new Player(5,5);

        for(int i = 1; i < randomInt; i++){
            int x = rand.nextInt(Renderer.windowMax.getX());
            int y = rand.nextInt(Renderer.windowMax.getY());
            characters[i] = new Monster(x,y, 'X');
        }
        characters[1] = new Monster(10,10, 'X');
        playerAlive = true;
        map = new Map();
        engine = new GameEngine(characters, map);
        score = 0;


    }

    private static void doGameLoop(GameEngine engine, Renderer renderer, GameCharacter[] characters) {

        renderer.draw(characters, map, score);
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
                renderer.draw(characters, map, score);
                key = null;
            }

            //System.out.println(key.getCharacter() + " " + key.getKind());
        }
        renderer.deathScreen();
    }
}