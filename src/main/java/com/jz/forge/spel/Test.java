package com.jz.forge.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * SpEL测试
 */
public class Test {
    /**
     * 文字表达式
     * @param args
     */
    public static void main(String[] args) {
        String s = "abcd";
        String t= "aecbd";
        System.out.println(findTheDifference(s,t));
    }

        public static char findTheDifference(String s, String t) {
            // 方法二： 求和相减，字符可以直接加减，ACISII码值可以直接计算
             int as = 0, at = 0;
             for (int i = 0; i < s.length(); i++) {
                 as += s.charAt(i);
             }
             for (int i = 0; i < t.length(); i++) {
                 at += t.charAt(i);
             }
             return (char)(at - as);
        }



}
