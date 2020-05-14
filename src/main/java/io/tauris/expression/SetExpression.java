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

    private Collection<? extends Element> elements;
    private Set<Object>                   values ;

    public SetExpression(Collection<? extends Element> set) {
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
    public String toString() {
        List<String> strs = new ArrayList<>();
        for (Element o : elements) {
            strs.add(o.toString());
        }
        return String.join(",", strs);
    }

    public  interface Element {
        Object value();
    }

    public static class StringElement implements Element {

        private String value;
        private char quoteChar;

        public StringElement(String value, char quoteChar) {
            this.value = value;
            this.quoteChar = quoteChar;
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

        private T value;

        public SimpleElement(T value) {
            this.value = value;
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
