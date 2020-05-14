package io.tauris.expression;


import java.util.regex.Pattern;

/**
 * @author Ray Chaung
 */
public class IsIP4Type implements IsType {

    private static final Pattern IP4_PATTERN = Pattern.compile("^\\d+\\.\\d+\\.\\d+\\.\\d+$");

    @Override
    public boolean check(Object value) {
        if (value == null || !(value instanceof String)) {
            return false;
        }
        String str = (String) value;
        return (IP4_PATTERN.matcher(str).matches());
    }

    @Override
    public String toString() {
        return "ip4";
    }
}
