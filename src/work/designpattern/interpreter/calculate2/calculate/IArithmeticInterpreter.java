package work.designpattern.interpreter.calculate2.calculate;

public interface IArithmeticInterpreter {
    int interpret();

    boolean isHighOrder();

    IArithmeticInterpreter getLeft();

    IArithmeticInterpreter getRight();

    IArithmeticInterpreter reset(IArithmeticInterpreter left, IArithmeticInterpreter right);
}