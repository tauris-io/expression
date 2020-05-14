package io.tauris.expression;


/**
 * @author Ray Chaung
 */
public class IsString implements IsType {

    @Override
    public boolean check(Object value) {
        return value instanceof String;
    }

    @Override
    public String toString() {
        return "string";
    }
}
