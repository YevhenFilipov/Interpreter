package command.commands;

import command.Command;
import interpretator.MyInterpretator;

/**
 * Created by Admin on 05.10.2014.
 */
public class PrintCurrValue implements Command {
    public PrintCurrValue() {
        super();
    }

    @Override
    public int execute() {
        System.out.print(MyInterpretator.arr[MyInterpretator.currIndexInArr]);
        int lengthOfExecutedCode = 1;
        return lengthOfExecutedCode;
    }
}
