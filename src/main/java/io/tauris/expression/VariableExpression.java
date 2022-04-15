package io.tauris.expression;


import java.util.Collection;
import java.util.Collections;

/**
 * @author Ray Chaung
 */
public class VariableExpression extends TExpression implements ContainerExpression {

    private final String name;

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
    public Boolean check(Context e) {
        Object val = e.get(name);
        if (val == null) {
            return false;
        }
        if (val instanceof Boolean) {
            return (Boolean) val;
        }
        if (val.getClass().isArray()) {
            return ((Object[])val).length > 0;
        }
        if (val instanceof String) {
            return !((String)val).isEmpty();
        }
        if (val instanceof Collection) {
            return ((Collection) val).isEmpty();
        }
        if (val instanceof Number) {
            return ((Number)val).longValue() != 0;
        }
        return true;
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
