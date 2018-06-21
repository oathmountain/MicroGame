package GameObjects;

import GameObjects.*;
import com.googlecode.lanterna.input.Key;


public class GameEngine {
    static int [][] gameObjects;
    private final int MONSTER = 2, WALL = 1, EMPTY = 0;
    public GameEngine(GameCharacter[] characters){
        gameObjects = new int[Renderer.windowMax.getX()][Renderer.windowMax.getY()];
        for(int i = 1; i < characters.length;i++){
            gameObjects[characters[i].getX()][characters[i].getY()] = MONSTER;
        }

    }
    public boolean tick(Key key, GameCharacter[] characters) {
        Player player = (Player) characters[0];
        if (checkKey(key)) {

            player.moveTo(key);
        }
        moveMonsters(characters, player);
        return checkDeath(characters);
    }

    private void moveMonsters(GameCharacter[] characters, Player player) {
        for(int i = 1; i < characters.length; i++){
            gameObjects[characters[i].getX()][characters[i].getY()] = EMPTY;
            ((Monster)characters[i]).moveTowards(player.getCoordinate());
            gameObjects[characters[i].getX()][characters[i].getY()] = MONSTER;
        }
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
