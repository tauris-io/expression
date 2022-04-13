package io.tauris.expression;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ray Chaung
 */
public class TBoolTest {

    @Test
    public void test() {
        Assert.assertTrue(TExpression.compile("2 > 1").check(null));
        Assert.assertFalse(TExpression.compile("2 < 1").check(null));

        MockContext e = new MockContext("");
        e.setField("name", "world");
        e.setField("empty", "");
        e.setField("status", 302);
        e.setField("flag", false);
        e.setField("array", new String[]{"v1", "v2", "v3"});
        e.addMeta("author", "chuanshi.zl");
        Assert.assertTrue(check("1 > 0", e));
        Assert.assertFalse(check("0 > 0", e));
        Assert.assertTrue(check("$empty is empty", e));
        Assert.assertTrue(check("[] is empty", e));
        Assert.assertTrue(check("$name == 'world'", e));
        Assert.assertTrue(check("@author == 'chuanshi.zl'", e));
        Assert.assertTrue(check("$status == 302.0", e));
        Assert.assertTrue(check("5 in [1,2,3,4,5,6]", e));
        Assert.assertTrue(check("true in [true,false]", e));
        Assert.assertTrue(check("'hello' in ['hello','world','!']", e));
        Assert.assertTrue(check("9.5 in [1.1,5.5,7.7,9.5,11.1]", e));
        Assert.assertFalse(check("'hello' not in ['hello','world','!']", e));
        Assert.assertTrue(check("'1.1.1.1' =~ /[\\d]+\\.[\\d]+\\.[\\d]+\\.[\\d]+/", e));
        Assert.assertTrue(check("'1.1.1.1' is host", e));
        Assert.assertTrue(check("'www.taobao.com' is host", e));
        Assert.assertTrue(check("$not_exist is null", e));
        Assert.assertTrue(check("2 > 1", e));
        Assert.assertTrue(check("1 < 2", e));
        Assert.assertTrue(check("$status >= 300 && $status < 400", e));

        Assert.assertTrue(check("$flag != true", e));
        Assert.assertTrue(check("'192.168.1.1' is ip4", e));
        Assert.assertTrue(check("$not_exist != true", e));
        Assert.assertFalse(check("$not_exist", e));

        Assert.assertTrue(check("'abc' in 'abcdefg'", e));
        Assert.assertTrue(check("'fgh' not in 'abcdefg'", e));
        Assert.assertTrue(check("'a' in ['a','b','c']",e));
        Assert.assertTrue(check("'e' not in ['a','b','c']", e));
        Assert.assertTrue(check("'v2' in $array", e));
        Assert.assertTrue(check("'v4' not in $array", e));
    }

    private boolean check(String exp, Context ctx) {
        TExpression ex = TExpression.compile(exp);
        Assert.assertEquals(exp, ex.toString());
        Assert.assertTrue(ex.equals(TExpression.compile(exp)));
        return ex.check(ctx);
    }

    @Test
    public void test2() {
        MockContext e = new MockContext("");
        e.setField("acl_id", 999l);
        Assert.assertTrue(TExpression.compile("$acl_id is not null && $acl_id > 990").check(e));
    }

    @Test
    public void test3() {
        MockContext e = new MockContext("");
        e.setField("upstream_addr", "");
        Assert.assertTrue(TExpression.compile("'99@9' is not host").check(e));
        Assert.assertFalse(TExpression.compile("$upstream_addr is not empty").check(e));
    }


    @Test
    public void test4() {
        MockContext e = new MockContext("");
        Map<String, String> tags = new HashMap<>();
        tags.put("source", "my");
        e.set("@tags", tags);
        Assert.assertTrue(TExpression.compile("@tags is not null && @tags.source is not empty").check(e));
    }

    @Test
    public void test5() {
        MockContext e = new MockContext("");
        e.addMeta("num", "99");
        e.addMeta("alpha", "my");
        e.addMeta("duplex", "my_99");
        Assert.assertTrue(TExpression.compile("@num =~ /[0-9]+/").check(e));
        Assert.assertTrue(TExpression.compile("@alpha =~ /[a-z]+/").check(e));
        Assert.assertTrue(TExpression.compile("@duplex =~ /[a-z_0-9]+/").check(e));
    }

    @Test
    public void test6() {
        MockContext e = new MockContext("");
        e.addMeta("topic", "warehouse");
        e.setField("product", "gf");
        Assert.assertTrue(TExpression.compile("@topic == 'warehouse' && $product == 'gf'").check(e));
        Assert.assertFalse(TExpression.compile("@topic == 'warehouse' && $product == 'waf'").check(e));
    }

    @Test
    public void test7() {
        String expr = "$user_info is null || ($user_info.g_level != 'G6' && $user_info.g_level != 'G7')";

        Map<String, Object> userinfo = new HashMap<>();
        userinfo.put("g_level", "G3");

        MockContext e = new MockContext("");
        e.setField("user_info", userinfo);
        System.out.println(TExpression.compile("$user_info is null || ($user_info.g_level != 'G6' && $user_info.g_level != 'G7')"));
        Assert.assertTrue(TExpression.compile("$user_info is null || ($user_info.g_level != 'G6' && $user_info.g_level != 'G7')").check(e));

        userinfo.put("g_level", "G6");
        Assert.assertFalse(TExpression.compile("$user_info is null || ($user_info.g_level != 'G6' && $user_info.g_level != 'G7' && $user_info.g_level != 'GC5')").check(e));
    }

    @Test
    public void test8() {
        MockContext e = new MockContext("");
        Assert.assertFalse(TExpression.compile("$geo_block").check(e));
        Assert.assertFalse(TExpression.compile("$geo_block is not null && $geo_block").check(e));

        e.setField("geo_block", true);
        Assert.assertTrue(TExpression.compile("$geo_block is not null && $geo_block").check(e));

        System.out.println(TExpression.compile("$geo_block is not null && $geo_block"));
    }

    @Test
    public void test9() {
        MockContext e = new MockContext("");
        e.setField("tmd_owner", "antibot_cc_4005_close");
        e.setField("http_user_agent", "Scoot/1.8.5 Android/5.0.2");
        Assert.assertTrue(TExpression.compile("'Android' in $http_user_agent").check(e));

        Assert.assertTrue(TExpression.compile("$tmd_owner is not empty && $tmd_owner =~ /^antibot_cc_\\d+_\\w+$/").check(e));
    }

    @Test
    public void test10() {
        MockContext e = new MockContext("");
        e.setField("warehouse", "cn123");
        Assert.assertTrue(TExpression.compile("$warehouse =~ /([a-z]{2}[\\d]{1,3}|[a-z]{1,3}\\-[a-z0-9\\-]{1,20})/").check(e));

        e.setField("warehouse", "aa5");
        Assert.assertTrue(TExpression.compile("$warehouse =~ /([a-z]{2}[\\d]{1,3}|[a-z]{1,3}\\-[a-z0-9\\-]{1,20})/").check(e));

        e.setField("warehouse", "ee21");
        Assert.assertTrue(TExpression.compile("$warehouse =~ /([a-z]{2}[\\d]{1,3}|[a-z]{1,3}\\-[a-z0-9\\-]{1,20})/").check(e));

        e.setField("warehouse", "beijing");
        Assert.assertTrue(TExpression.compile("$warehouse =~ /[a-z]+/").check(e));

        e.setField("warehouse", "southeast-1");
        Assert.assertTrue(TExpression.compile("$warehouse =~ /[a-z\\-]+\\d+/").check(e));

        e.setField("warehouse", "123");
        Assert.assertTrue(TExpression.compile("not ($warehouse =~ /[a-z]+/)").check(e));

        e.setField("warehouse", "cn123!");
        Assert.assertTrue(TExpression.compile("not ($warehouse =~ /([a-z]{2}[\\d]{1,3}|[a-z]{1,3}\\-[a-z0-9\\-]{1,20})/ && 1 == 1)").check(e));


    }

    @Test
    public void test1x() {
        MockContext e = new MockContext("");
        e.setField("even", 7 * 1000);
        Assert.assertTrue(TExpression.compile("($even / 1000) % 2 == 1").check(e));
        Assert.assertFalse(TExpression.compile("($even / 1000) % 2 == 0").check(e));
        e.setField("odd", 8 * 1000);
        Assert.assertTrue(TExpression.compile("($odd / 1000) % 2 == 0").check(e));
        Assert.assertFalse(TExpression.compile("($odd / 1000) % 2 == 1").check(e));
    }

    @Test
    public void test1y() {
        String expr = "$b_action is empty && $t_blocks == 1 && ($cc_test is null || not $cc_test)";
        TExpression expression = TExpression.compile(expr);

        MockContext e = new MockContext("");
        e.set("t_blocks", 1);

        Assert.assertTrue(expression.check(e));
    }

    @Test
    public void test1z() {
        String expr = "$action in ['a', 'b', 'c']";
        TExpression expression = TExpression.compile(expr);
        System.out.println(expression);

        MockContext e = new MockContext("");
//        e.set("antiscan_action", "b");
        Assert.assertFalse(expression.check(e));
    }


    @Test
    public void test11() {
        String expr = "($v / 3) > ($v / 2) && $b =~ /hello/ || $c > 10";
        TExpression.compile(expr);
    }

    @Test
    public void test12() {
        String expr = "$status == '200' && $request_uri =~ /\\/.*/";
        TExpression expression = TExpression.compile(expr);

        MapContext ctx = new MapContext();
        ctx.set("$status", "200");
        ctx.set("$request_uri", "/hello/world");
        Assert.assertTrue(expression.check(ctx));
    }

    @Test
    public void testStartswith() {
        String expr = "$str startswith 'hello'";
        TExpression expression = TExpression.compile(expr);

        MapContext ctx = new MapContext();
        ctx.set("$str", "hello world");
        Assert.assertTrue(expression.check(ctx));

        ctx.set("$str", "world hello");
        Assert.assertFalse(expression.check(ctx));

        expr = "$str startswith $sub";
        expression = TExpression.compile(expr);

        ctx.set("$str", "hello world");
        ctx.set("$sub", "hello");
        Assert.assertTrue(expression.check(ctx));
    }

    @Test
    public void testEndswith() {
        String expr = "$str endswith 'world'";
        TExpression expression = TExpression.compile(expr);

        MapContext ctx = new MapContext();
        ctx.set("$str", "hello world");
        Assert.assertTrue(expression.check(ctx));

        ctx.set("$str", "world hello");
        Assert.assertFalse(expression.check(ctx));

        expr = "$str endswith $sub";
        expression = TExpression.compile(expr);

        ctx.set("$str", "hello world");
        ctx.set("$sub", "world");
        Assert.assertTrue(expression.check(ctx));
    }

    @Test
    public void testExists() {
        String expr = "$str exists";
        TExpression expression = TExpression.compile(expr);

        MapContext ctx = new MapContext();
        ctx.set("$str", "hello world");
        Assert.assertTrue(expression.check(ctx));

        ctx = new MapContext();
        Assert.assertFalse(expression.check(ctx));
    }
}


