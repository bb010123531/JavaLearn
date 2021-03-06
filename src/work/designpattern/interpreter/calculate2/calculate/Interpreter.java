package work.designpattern.interpreter.calculate2.calculate;

public abstract class Interpreter implements IArithmeticInterpreter {

    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        this.left = left;
        this.right = right;
    }

    public IArithmeticInterpreter getLeft() {
        return left;
    }

    public IArithmeticInterpreter getRight() {
        return right;
    }
}