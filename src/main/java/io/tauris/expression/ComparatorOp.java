package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public abstract class ComparatorOp {

    public abstract Comparable eval(Context e, TExpression left, TExpression right);

    private static int compare(Context e, TExpression left, TExpression right) {
        Comparable lv = (Comparable)left.eval(e);
        Comparable rv = (Comparable)right.eval(e);
        if (lv == null && rv == null) {
            return 0;
        }
        if (lv == null) {
            return -1;
        }
        if (rv == null) {
            return 1;
        }
        if (lv instanceof Number) {
            lv = ((Number)lv).doubleValue();
        }
        if (rv instanceof Number) {
            rv = ((Number)rv).doubleValue();
        }
        return lv.compareTo(rv);
    }

    public static ComparatorOp build(String op) {
        if (op.equals(">")) {
            return GT.gt;
        }
        if (op.equals(">=")) {
            return GT.gte;
        }
        if (op.equals("<")) {
            return LT.lt;
        }
        if (op.equals("<=")) {
            return LT.lte;
        }
        if (op.equals("==")) {
            return EQ.eq;
        }
        if (op.equals("!=")) {
            return NE.ne;
        }
        throw new IllegalArgumentException("illegal comparator op :" + op);
    }

    private static class GT extends ComparatorOp {

        private static final GT gt = new GT();
        private static final GT gte = new GT(true);

        private boolean equals;

        public GT() {
        }

        public GT(boolean equals) {
            this.equals = equals;
        }

        @Override
        public Comparable eval(Context e, TExpression left, TExpression right) {
            int x = compare(e, left, right);
            return x > 0 || (equals && x == 0);
        }

        @Override
        public String toString() {
            return equals ? ">=" : ">";
        }
    }

    private static class LT extends ComparatorOp {

        private static final LT lt = new LT();
        private static final LT lte = new LT(true);

        private boolean equals;

        public LT() {
        }

        public LT(boolean equals) {
            this.equals = equals;
        }

        @Override
        public Comparable eval(Context e, TExpression left, TExpression right) {
            int x = compare(e, left, right);
            return x < 0 || (equals && x == 0);
        }

        @Override
        public String toString() {
            return equals ? "<=" : "<";
        }
    }

    private static class EQ extends ComparatorOp {

        private static final EQ eq = new EQ();

        @Override
        public Comparable eval(Context e, TExpression left, TExpression right) {
            int x = compare(e, left, right);
            return x == 0;
        }

        @Override
        public String toString() {
            return "==";
        }
    }

    private static class NE extends ComparatorOp {

        private static final NE ne = new NE();

        @Override
        public Comparable eval(Context e, TExpression left, TExpression right) {
            int x = compare(e, left, right);
            return x != 0;
        }

        @Override
        public String toString() {
            return "!=";
        }
    }



}
