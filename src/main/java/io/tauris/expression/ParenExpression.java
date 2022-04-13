package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class ParenExpression extends TExpression {

    private final TExpression inner;

    public ParenExpression(TExpression inner) {
        this.inner = inner;
    }

    @Override
    public Object eval(Context e) {
        return inner.eval(e);
    }

    @Override
    public String toString() {
        return "(" + inner.toString() + ")";
    }
}
