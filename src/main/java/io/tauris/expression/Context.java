package io.tauris.expression;

/**
 * Class Context
 *
 * @author Ray Chaung
 */
public interface Context {

    /**
     * get value by name
     * @param name context variable name, the first character of name is '$' or '@'
     * @return context variable value
     */
    Object get(String name);

    default void set(String name, Object value) {

    }
}
