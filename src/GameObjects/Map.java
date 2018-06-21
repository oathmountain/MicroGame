package GameObjects;

public class Map {
    private boolean[][] map;
    public Map(){
        map = new boolean[Renderer.windowMax.getX() -5][Renderer.windowMax.getY() -5];
        for(int i = 0; i < Renderer.windowMax.getX() -5;i++){
            for(int y = 0; y < Renderer.windowMax.getY() -5;y++){
                if(i == 15 && y > 10 && y < 20){
                    map[i][y] = true;
                }
                if(y == 10 && i > 10 && i < 15){
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
