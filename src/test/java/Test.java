import interpretator.MyInterpretator;

/**
 * Created by Admin on 07.10.2014.
 */
public class Test {


    public static void main(String[] args) {
        String code = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
        String code2 = "++++[>++++++<-]>++>+++++++++[>++++++++++<-]<[>>.-<<-]";
        String code3 = ">+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>+++[->+++++<]>[-]<<<<<<]<<]>[-]<<<<<]<<]>[-]<<<<<]<<]>[-]<<<<<]<<]>.";
        MyInterpretator testInterpretator = new MyInterpretator(code);

        testInterpretator.executeCode();
    }

}
