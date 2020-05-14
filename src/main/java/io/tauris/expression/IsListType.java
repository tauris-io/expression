package io.tauris.expression;

import java.util.List;

/**
 * @author Ray Chaung
 */
public class IsListType implements IsType {

    @Override
    public boolean check(Object value) {
        return value != null && ((value instanceof List) || value.getClass().isArray());
    }

    @Override
    public String toString() {
        return "list";
    }
}
