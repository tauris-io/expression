package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class IsTrueType implements IsType {

    @Override
    public boolean check(Object value) {
        return "true".equals(value);
    }

    @Override
    public String toString() {
        return "true";
    }
}
