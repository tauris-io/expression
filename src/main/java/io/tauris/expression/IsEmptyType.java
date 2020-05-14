package io.tauris.expression;



import java.util.Collection;

/**
 * @author Ray Chaung
 */
public class IsEmptyType implements IsType {

    @Override
    public boolean check(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof String) {
            return ((String)value).trim().isEmpty();
        }
        if (value instanceof Collection) {
            return ((Collection)value).isEmpty();
        }
        return false;
    }

    @Override
    public String toString() {
        return "empty";
    }
}
