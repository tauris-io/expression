package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public abstract class BinaryOp {

    public abstract boolean eval(Context e, TExpression left, TExpression right);

    public static BinaryOp build(String op) {
        if (op.equals("&&") || op.equals("and")) {
            return And.and;
        }
        if (op.equals("||") || op.equals("or")) {
            return Or.or;
        }
        throw new IllegalArgumentException("illegal binary op :" + op);
    }

    private static class Or extends BinaryOp {

        private static final Or or = new Or();

        @Override
        public boolean eval(Context e, TExpression left, TExpression right) {
            boolean lv = left.check(e);
            if (lv) {
                return true;
            }
            return right.check(e);
        }

        @Override
        public String toString() {
            return "||";
        }
    }

    private static class And extends BinaryOp {

        private static final And and = new And();

        @Override
        public boolean eval(Context e, TExpression left, TExpression right) {
            boolean lv = left.check(e);
            if (!lv) return false;
            return right.check(e);
        }
        @Override
        public String toString() {
            return "&&";
        }
    }

}
