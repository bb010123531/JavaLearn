package work.designpattern.interpreter.calculate2.calculate;

public class AddInterpreter extends Interpreter {

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }

    @Override
    public boolean isHighOrder() {
        return false;
    }

    @Override
    public IArithmeticInterpreter reset(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        return new AddInterpreter(left, right);
    }
}