package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class InExpression extends TExpression {

    private final TExpression         left;
    private final ContainerExpression container;

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
        if (not) {
            return String.format("%s not in %s", left.toString(), container.toString());
        } else {
            return String.format("%s in %s", left.toString(), container.toString());
        }
    }
}
