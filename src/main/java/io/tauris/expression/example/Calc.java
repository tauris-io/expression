package io.tauris.expression.example;

import io.tauris.expression.Context;
import io.tauris.expression.TExpression;

public class Calc {

    public static void main(String[] argv) {
        Context ctx = new Context() {
            @Override
            public Object get(String name) {
                switch (name) {
                    case "$value": {
                        return 100;
                    }
                    case "@meta": {
                        return 10;
                    }
                }
                throw new IllegalArgumentException();
            }
        };
        TExpression expression = TExpression.compile("($value - 10) / @meta");

        Object val = expression.eval(ctx);
        System.out.println(String.format("result is %s", val));
    }
}
