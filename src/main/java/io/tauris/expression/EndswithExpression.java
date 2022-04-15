package io.tauris.expression;



/**
 * @author Ray Chaung
 */
public class EndswithExpression extends TExpression {

    private final TExpression left;
    private final TExpression right;

    public EndswithExpression(TExpression left, TExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object eval(Context e) {
        Object l = left.eval(e);
        Object r = right.eval(e);
        return l != null && r != null && ((String)l).endsWith((String)right.eval((e)));
    }

    public String toString() {
        return String.format("%s endswith %s", left, right);
    }
}
