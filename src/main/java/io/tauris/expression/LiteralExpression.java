package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public abstract class LiteralExpression extends TExpression {

    public static class INT extends LiteralExpression {

        private final Long value;

        public INT(Long value) {
            this.value = value;
        }

        @Override
        public Object eval(Context e) {
            return value;
        }

        @Override
        public Boolean check(Context e) {
            return value != 0;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public static class FLOAT extends LiteralExpression {

        private final Double value;

        public FLOAT(Double value) {
            this.value = value;
        }

        @Override
        public Object eval(Context e) {
            return value;
        }

        @Override
        public Boolean check(Context e) {
            return value != 0;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

    public static class STRING extends LiteralExpression implements ContainerExpression {

        private final String value;

        private boolean doubleQuote;

        public STRING(String expr) {
            this.value = expr.substring(1, expr.length() - 1);
            if (!this.value.isEmpty() && this.value.charAt(0) == '"') {
                doubleQuote = true;
            }
        }

        @Override
        public boolean contains(Context c, Object o) {
            return o instanceof String && value.contains((String) o);
        }

        @Override
        public Boolean check(Context e) {
            return !value.isEmpty();
        }

        @Override
        public Object eval(Context e) {
            return value;
        }

        @Override
        public String toString() {
            if (doubleQuote) {
                return String.format("\"%s\"", value);
            } else {
                return String.format("'%s'", value);
            }
        }
    }

    public static class BOOLEAN extends LiteralExpression {

        private final Boolean value;

        public BOOLEAN(Boolean value) {
            this.value = value;
        }

        @Override
        public Object eval(Context e) {
            return value;
        }

        @Override
        public Boolean check(Context e) {
            return value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
