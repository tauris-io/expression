package io.tauris.expression;

/**
 * @author Ray Chaung
 */
public class ExprException extends RuntimeException {

    public ExprException(String message) {
        super(message);
    }

    public ExprException(String message, Throwable cause) {
        super(message, cause);
    }
}
