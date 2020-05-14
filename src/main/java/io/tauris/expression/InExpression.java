package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class InExpression extends TExpression {

    private TExpression         left;
    private ContainerExpression container;

    private boolean not;

    public InExpression(TExpression left, ContainerExpression cntExpr) {
        this.left = left;
        this.container = cntExpr;
    }

    public InExpression(TExpression left, ContainerExpression cntExpr, boolean not) {
        this.left = left;
        this.container = cntExpr;
        this.not = not;
    }

    @Override
    public Object eval(Context e) {
        Object v = left.eval(e);
        if (v == null) return false;
        boolean r = container.contains(e, v);
        return not ? !r : r;
    }

    @Override
    public String toString() {
        return String.format("%s in [%s]", left.toString(), container.toString());
    }
}
