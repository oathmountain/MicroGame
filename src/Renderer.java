import GameObjects.GameCharacter;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Renderer {
    private Terminal terminal;

    public Renderer() {
        terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);
    }

    public void render(GameCharacter[] objects) {
        terminal.clearScreen();
        for (GameCharacter g : objects) {
            terminal.moveCursor(g.getX(), g.getY());
            terminal.putCharacter(g.getSymbol());
        }

    }

    public Terminal getTerminal() {
        return this.terminal;
    }


}
