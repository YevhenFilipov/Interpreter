package command.commands;

import command.Command;
import interpretator.MyInterpretator;
import services.Services;

/**
 * Created by Admin on 05.10.2014.
 */
public class While implements Command {
    private String code;
    private int currPositionInCode;

    public While(String code, int currPositionInCode) {
        super();
        this.code = code;
        this.currPositionInCode = currPositionInCode;
    }

    @Override
    public int execute() {
        Services service = new Services();
        String loopCode = service.getLoopCode(code, currPositionInCode);
        while (MyInterpretator.arr[MyInterpretator.currIndexInArr] != 0) {
            MyInterpretator loopInterpretator = new MyInterpretator(loopCode);
            loopInterpretator.executeCode();
        }
        int lengthOfExecutedCode = loopCode.length() + 2;
        return lengthOfExecutedCode;
    }
}
