package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class NotExpression extends TExpression {

    private final TExpression right;

    public NotExpression(TExpression right) {
        if (right == null) throw new IllegalArgumentException("null value");
        this.right = right;
    }

    @Override
    public Object eval(Context e) {
        boolean ret = right.check(e);
        return !ret;
    }

    @Override
    public String toString() {
        return "not " + right.toString();
    }
}
