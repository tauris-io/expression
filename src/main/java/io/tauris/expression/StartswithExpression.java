package io.tauris.expression;



/**
 * @author Ray Chaung
 */
public class StartswithExpression extends TExpression {

    private final TExpression left;
    private final TExpression right;

    public StartswithExpression(TExpression left, TExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object eval(Context e) {
        Object l = left.eval(e);
        Object r = right.eval(e);
        return l != null && r != null && ((String)left.eval(e)).startsWith((String)right.eval((e)));
    }

    public String toString() {
        return String.format("%s startswith %s", left, right);
    }
}
