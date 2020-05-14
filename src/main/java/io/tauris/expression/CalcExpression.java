package io.tauris.expression;

import java.util.function.BiFunction;

/**
 * @author Ray Chaung
 */
public class CalcExpression extends TExpression {

    private TExpression left;
    private TExpression right;
    private String opChar;
    private BiFunction<Number, Number, Number> op;

    public CalcExpression(TExpression left, TExpression right, String opChar, BiFunction<Number, Number, Number> op) {
        throwIfNull(left, "left");
        throwIfNull(right, "right");
        this.left = left;
        this.right = right;
        this.opChar = opChar;
        this.op = op;
    }

    @Override
    public Object eval(Context e) {
        Number lv = left.calc(e);
        Number rv = right.calc(e);
        return op.apply(lv, rv);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", left.toString(), opChar, right.toString());
    }
}
