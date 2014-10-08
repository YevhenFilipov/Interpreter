package interpretator;

import command.Command;
import commands_factory.CommandsFactory;

/**
 *
 */
public class MyInterpretator {
    public static char[] arr = new char[30000];
    public static int currIndexInArr = 0;
    private String code;
    private int currPositionInCode = 0;

    public MyInterpretator(String code) {
        this.code = code;
    }

    public void executeCode() {

        while (currPositionInCode < code.length()) {
            CommandsFactory commandsFactory = new CommandsFactory(code, currPositionInCode);
            Command currCommand = commandsFactory.getCommand(code.charAt(currPositionInCode));
            currPositionInCode += currCommand.execute();
        }
    }
}
