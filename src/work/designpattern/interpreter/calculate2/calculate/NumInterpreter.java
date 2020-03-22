package work.designpattern.interpreter.calculate2.calculate;

public class NumInterpreter implements IArithmeticInterpreter {
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }


    public int interpret() {
        return this.value;
    }

    @Override
    public boolean isHighOrder() {
        return true;
    }

    @Override
    public IArithmeticInterpreter getLeft() {
        return null;
    }

    @Override
    public IArithmeticInterpreter getRight() {
        return null;
    }

    @Override
    public IArithmeticInterpreter reset(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        return null;
    }
}