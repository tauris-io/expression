package io.tauris.expression;


import java.util.Collection;

/**
 * @author Ray Chaung
 */
public class VariableExpression extends TExpression implements ContainerExpression {

    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean contains(Context c, Object o) {
        Object val = c.get(name);
        if (val == null) {
            return false;
        }
        if (val.getClass().isArray()) {
            for (Object item : ((Object[])val)) {
                if (item.equals(o)) {
                    return true;
                }
            }
            return false;
        }
        if (val instanceof String && o instanceof String) {
            return ((String)val).contains(((String)o));
        }
        return val instanceof Collection && ((Collection) val).contains(o);
    }

    @Override
    public Object eval(Context e) {
        if (e == null) {
            return null;
        }
        return e.get(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
