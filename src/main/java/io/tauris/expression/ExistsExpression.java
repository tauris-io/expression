package io.tauris.expression;



/**
 * @author Ray Chaung
 */
public class ExistsExpression extends TExpression {

    private final TExpression left;

    public ExistsExpression(TExpression left) {
        this.left = left;
    }

    @Override
    public Object eval(Context e) {
        return left.eval(e) != null;
    }

    public String toString() {
        return String.format("%s exists", left);
    }
}
