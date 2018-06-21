package GameObjects;

import java.util.Random;

public class Map {
    private boolean[][] map;
    public Map(){
        map = new boolean[Renderer.windowMax.getX()][Renderer.windowMax.getY()];
        Random rand = new Random();
        for(int i = 0; i < Renderer.windowMax.getX();i++){
            for(int y = 0; y < Renderer.windowMax.getY();y++){
                if(i == 0 || y == 0 || i == Renderer.windowMax.getX()-1 || y == Renderer.windowMax.getY()-1){
                    map[i][y] = true;
                }
                if(i == 15 && y > 10 && y < 20){
                    map[i][y] = true;
                }
                if(y == 10 && i > 10 && i < 15){
                    map[i][y] = true;
                }
                if(rand.nextInt(10) == 1) {
                    map[i][y] = true;
                }
            }
        }
    }
    public boolean[][] getMap(){
        return map;
    }
    public char getSymbol(){
        return 'C';
    }

}
