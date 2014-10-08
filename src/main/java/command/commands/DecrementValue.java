package command.commands;

import command.Command;
import interpretator.MyInterpretator;

/**
 * Created by Admin on 05.10.2014.
 */
public class DecrementValue implements Command {

    @Override
    public int execute() {
        MyInterpretator.arr[MyInterpretator.currIndexInArr]--;
        int lengthOfExecutedCode = 1;
        return lengthOfExecutedCode;
    }
}
