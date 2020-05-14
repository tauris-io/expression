# Tauris Expression Engine
[![Build Status](https://travis-ci.org/tauris-io/expression.svg?branch=master)](https://travis-ci.org/tauris-io/expression) 
[![Coverage status](https://img.shields.io/codecov/c/github/tauris-io/expression/master.svg)](https://codecov.io/github/tauris-io/expression)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.tauris/expression/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.tauris/expression)

Boolean evaluation and digital calculation expression engine for Java


Boolean Evaluation：

```
$country in ['cn', 'us', 'jp'] && $length > 100
$host == 'cs.qa.com' && 'Webkit' not in $ua
```

Digital calculation:

```
( 1 ^ 5) + (2 << 3)
4 | 3 + 3
```



## Requirements

Java 1.8+

Maven

```
  <dependency>
    <groupId>io.tauris</groupId>
    <artifactId>expression</artifactId>
    <version>{ LATEST_VERSION }</version>
  </dependency>
```

## Tutorials

First import class

``` java
import io.tauris.expression.TExpression;
```

Boolean Evaluation

```
String expr = "$status == '200' && $request_uri =~ /\\/.*/";
TExpression expression = TExpression.compile(expr);

MapContext ctx = new MapContext();
ctx.set("$status", "200");
ctx.set("$request_uri", "/hello/world");

if (expression.check(ctx)) {
	// print true
}

```


Digital calculation:

```
String expr = "1000 / $rnd";
TExpression expression = TExpression.compile(expr);

MapContext ctx = new MapContext();
ctx.set("$rnd", 200");

System.out.println(expression.calc(ctx).intValue()); //print 5

```



## Definition
### Arithmetic Operators

| Operator | Description | Example   |
| ------ | ---- | ------ |
| +      | addition   | 1+1=2  |
| -      | subtraction   | 2-1=1  |
| *      | multiplication   | 2*2=4  |
| /      | division   | 2/2=1  |
| %      | modulus | 5/2=1  |
| ^      | pow   | 2^4=16 |

*不支持位运算*

### Comparison Operators

| Operator | Description                                                         | Example         |
| ------ | ------------------------------------------------------------ | ------------ |
| ==    | equal    | $A==$B     |
| !=    | not equal    | $A!=$B     |
| >   | greater than | $A>$B  |
| <    | less than | $A<$B |
| >=     | greater than or equal to     | $A>=$B    |
| <=   | less than or equal to)| $A<=$B |

*notice the type of left value MUST same with right value*


### Logical Operators

| Operator | Description                                                         | Example         |
| ------ | ------------------------------------------------------------ | ------------ |
| &&     | and    | $A && $B       |
| \|\|   | or | $A \|\| $B     |
| not    | not | not（$A && $B) |

### Contain Operator

| Operator |      Description                                                    | Example         |
| ------ | ------------------------------------------------------------ | ------------ |
| in     | true, if the left value in the right value    | $c in ['a', 'b', 'c', 'd'] |



### Regular Expression Match

| Operator | Description                                                        | Example         |
| ------ | ------------------------------------------------------------ | ------------ |
| =~    | true, the right expressio is matched to left value    | 'world' =~ /.+orl.+/       |



### IS 

| Operator | Description                         | Example       |
| ------ | ---------------------------- | ---------- |
| is     | left value IS the right type | $v is empty |
| is not   | left vlaue IS NOT the right type | $v is not null |

below is right types:

| name | Description                        | Example       |
| ------ | ---------------------------- | ---------- |
| string    || $v is string |
| integer   | | $v is integer |
| float   |  | $v is float |
| boolean   |  | $v is boolean && not $v |
| host    | hostname | $v is host |
| ip4    | ipv4 address | $v is ip4 |
| empty    | null、empty string or empty array | $v is not empty |
| null    | null | $v is not null |

### Function

#### eval

Evaluated an expression

example:

```
// $exp = "$remote_addr is ip4"
"eval($exp)"
```


