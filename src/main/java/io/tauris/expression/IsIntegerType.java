package io.tauris.expression;



import java.util.regex.Pattern;

/**
 * @author Ray Chaung
 */
public class IsIntegerType implements IsType {

    private Pattern INT_PATTERN = Pattern.compile("^[0-9]+$");
    @Override
    public boolean check(Object value) {
        if (value == null) return false;
        if (value instanceof Integer || value instanceof Long) {
            return true;
        }
        if (value instanceof String){
            return INT_PATTERN.matcher(value.toString()).matches();
        }
        return false;
    }

    @Override
    public String toString() {
        return "integer";
    }
}
