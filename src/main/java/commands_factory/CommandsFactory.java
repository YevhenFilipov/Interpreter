package commands_factory;

import command.Command;
import command.commands.*;

/**
 * Created by Admin on 06.10.2014.
 */
public class CommandsFactory {

    private String code;
    private int currPositionInCode;

    public CommandsFactory(String code, int currPositionInCode) {
        this.code = code;
        this.currPositionInCode = currPositionInCode;
    }

    public Command getCommand(char operator) {

        switch (operator) {
            case '>':
                return new GoToNextCell();
            case '<':
                return new GotoPrevCell();
            case '+':
                return new IncrementValue();
            case '-':
                return new DecrementValue();
            case '.':
                return new PrintCurrValue();
            case '[':
                return new While(code, currPositionInCode);
        }
        return null;
    }
}
