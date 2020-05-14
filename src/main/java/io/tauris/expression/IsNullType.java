package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class IsNullType implements IsType {

    @Override
    public boolean check(Object value) {
        return value == null;
    }

    @Override
    public String toString() {
        return "null";
    }
}
