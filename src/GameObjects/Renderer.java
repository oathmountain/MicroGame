package GameObjects;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Renderer {
    private Terminal terminal;
    public static Coordinate windowMax;

    public Renderer() {
        terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);
        windowMax = new Coordinate(terminal.getTerminalSize().getColumns(), terminal.getTerminalSize().getRows());
    }

    public void render(GameCharacter[] objects) {
        terminal.clearScreen();
        for (GameCharacter g : objects) {
            terminal.applyBackgroundColor(0);
            terminal.moveCursor(g.getX(), g.getY());
            terminal.putCharacter(g.getSymbol());
        }

    }

    public void renderMap(Map map) {
        boolean[][] walls = map.getMap();
        for(int i = 0; i < walls.length; i++) {
            for(int j = 0; j < walls[i].length; j++) {
                if(walls[i][j]) {
                    terminal.moveCursor(i, j);
                    terminal.applyBackgroundColor(20);
                    terminal.putCharacter(' ');
                }
            }
        }
    }
    public void deathScreen() {
        String s = "Game Over";

        drawSquare(10,10, 15,5);
        printText(s, 13,12);
    }
    public void printText(String s, int startX, int y) {
        for(int i = 0; i < s.length(); i++) {
            terminal.moveCursor(startX + i, y);
            terminal.putCharacter(s.charAt(i));
        }
    }

    public void drawSquare(int startX, int startY, int width, int height) {
        for(int i = startX; i < startX + width; i++) {
            for(int j = startY; j < startY + height; j++) {
                terminal.moveCursor(i, j);
                terminal.applyBackgroundColor(75);
                terminal.putCharacter(' ');
            }
        }
    }

    public Terminal getTerminal() {
        return this.terminal;
    }


}
