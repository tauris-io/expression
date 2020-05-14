package io.tauris.expression;

import java.util.List;

/**
 * @author Ray Chaung
 */
public interface EmbedFunction {

    String name();
    Object execute(Context ctx, List<Object> params);

}
