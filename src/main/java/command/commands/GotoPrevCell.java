package command.commands;

import command.Command;
import interpretator.MyInterpretator;

/**
 * Created by Admin on 05.10.2014.
 */
public class GotoPrevCell implements Command {
    public GotoPrevCell() {
        super();
    }

    @Override
    public int execute() {
        MyInterpretator.currIndexInArr--;
        int lengthOfExecutedCode = 1;
        return lengthOfExecutedCode;
    }
}
