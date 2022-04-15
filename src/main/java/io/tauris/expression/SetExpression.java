package io.tauris.expression;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ray Chaung
 */
public class SetExpression extends TExpression implements ContainerExpression {

    private final List<? extends Element> elements;
    private final Set<Object>             values;

    public SetExpression(List<? extends Element> set) {
        this.elements = set;
        this.values = set.stream().map(Element::value).collect(Collectors.toSet());
    }

    public boolean contains(Context c, Object o) {
        return values.contains(o);
    }

    @Override
    public Object eval(Context e) {
        return values;
    }

    @Override
    public Boolean check(Context e) {
        return !values.isEmpty();
    }

    @Override
    public String toString() {
        List<String> strs = new ArrayList<>();
        for (Element o : elements) {
            strs.add(o.toString());
        }
        return "[" + String.join(",", strs) + "]";
    }

    public  interface Element {
        Object value();

        boolean check();
    }

    public static class StringElement implements Element {

        private final String value;
        private final char   quoteChar;

        public StringElement(String value, char quoteChar) {
            this.value = value;
            this.quoteChar = quoteChar;
        }

        @Override
        public boolean check() {
            return !value.isEmpty();
        }

        @Override
        public Object value() {
            return value;
        }

        public String toString() {
            return quoteChar + value + quoteChar;
        }
    }

    public static class SimpleElement<T> implements Element {

        private final T value;
        private final boolean bool;

        public SimpleElement(T value, boolean bool) {
            this.value = value;
            this.bool = bool;
        }

        @Override
        public boolean check() {
            return bool;
        }

        @Override
        public T value() {
            return value;
        }

        public String toString() {
            return value.toString();
        }
    }
}
