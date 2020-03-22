package work.designpattern.interpreter.calculate2.calculate;

public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*"));
    }

    public static IArithmeticInterpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        if (isSpecial(symbol) && !left.isHighOrder()) {
            if (symbol.equals("+")) {
                return new AddInterpreter(left, right);
            } else if (symbol.equals("-")) {
                return new SubInterpreter(left, right);
            } else if (symbol.equals("*")) {
                return left.reset(left.getLeft(), new MultiInterpreter(left.getRight(), right));
            } else if (symbol.equals("/")) {
                return left.reset(left.getLeft(), new DivInterpreter(left.getRight(), right));
            }
        } else {
            if (symbol.equals("+")) {
                return new AddInterpreter(left, right);
            } else if (symbol.equals("-")) {
                return new SubInterpreter(left, right);
            } else if (symbol.equals("*")) {
                return new MultiInterpreter(left, right);
            } else if (symbol.equals("/")) {
                return new DivInterpreter(left, right);
            }
        }
        return null;
    }

    private static boolean isSpecial(String symbol) {
       return  "*".equalsIgnoreCase(symbol) || "/".equalsIgnoreCase(symbol);
    }
}