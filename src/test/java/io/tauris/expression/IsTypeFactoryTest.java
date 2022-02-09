package io.tauris.expression;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class IsTypeFactoryTest
 *
 * @author yundun-waf-dev
 * @date 2019-03-21
 */
public class IsTypeFactoryTest {


    @Test
    public void testCamelToUnderscore() {
        Assert.assertEquals("ip4", IsTypeFactory.camelToUnderscore("IP4"));
        Assert.assertEquals("my_name_is_tauris", IsTypeFactory.camelToUnderscore("MyNameIsTauris"));
        Assert.assertEquals("last_char_is_u", IsTypeFactory.camelToUnderscore("lastCharIsU"));
        Assert.assertEquals("normal_underscore", IsTypeFactory.camelToUnderscore("normalUnderscore"));
        Assert.assertEquals("a_bc", IsTypeFactory.camelToUnderscore("aBc"));
    }

    @Test
    public void testRegisterType() {
        TExpression.registerType(new IsTest());
        Assert.assertTrue(TExpression.compile("'test' is test").check(new MockContext()));
    }

    public static class IsTest implements IsType {
        @Override
        public boolean check(Object value) {
            return "test".equals(value);
        }
    }
}
