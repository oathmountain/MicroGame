import GameObjects.GameCharacter;
import GameObjects.Player;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        InputListener input = new InputListener();
        GameEngine engine = new GameEngine();
        GameCharacter[] characters = new GameCharacter[1];
        characters[0] = new Player();

        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();

    }
}