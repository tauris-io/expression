package io.tauris.expression;



import java.util.regex.Pattern;

/**
 * @author Ray Chaung
 */
public class IsFloatType implements IsType {

    private Pattern FLOAT_PATTERN = Pattern.compile("^[0-9]+\\.[0-9]+$");
    @Override
    public boolean check(Object value) {
        if (value == null) return false;
        if (value instanceof Float || value instanceof Double) {
            return true;
        }
        if (value instanceof String){
            return FLOAT_PATTERN.matcher(value.toString()).matches();
        }
        return false;
    }

    @Override
    public String toString() {
        return "float";
    }
}
