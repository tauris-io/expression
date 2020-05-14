package io.tauris.expression;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ray Chaung
 */
public class MapContext implements Context {

    private ConcurrentHashMap<String, Object> values = new ConcurrentHashMap<>();

    @Override
    public Object get(String name) {
        return values.get(name);
    }

    @Override
    public void set(String name, Object value) {
        values.put(name, value);
    }
}
