package work.designpattern.interpreter.calculate2.calculate;

public class MultiInterpreter extends Interpreter {

    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left,right);
    }

    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }

    @Override
    public boolean isHighOrder() {
        return true;
    }

    @Override
    public IArithmeticInterpreter reset(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        return new MultiInterpreter(left, right);
    }
}
