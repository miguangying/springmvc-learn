package org.springframework.util.test;

import org.junit.Test;
import org.springframework.util.StringUtils;

/**
 *
 * spring-core org.springframework.util.StringUtils 测试类
 * Created by Administrator on 2016/12/11.
 *
 */
public class StringUtilsTest {

    @Test
    public void isEmptyTest(){
        boolean val = StringUtils.isEmpty("");
        System.out.println(val);
        boolean val2 = StringUtils.isEmpty(new Integer(128));
        System.out.println(val2);
        boolean val3 = StringUtils.isEmpty(new String(""));
        System.out.println(val3);
    }

    @Test
    public void hasLengthTest(){
        boolean val = StringUtils.hasLength("");
        System.out.println(val);
        boolean val2 = StringUtils.hasLength(new String(""));
        System.out.println(val2);
        boolean val3 = StringUtils.hasLength(new String("a"));
        System.out.println(val3);
    }


    /*
     * hasText 判断是否有文本内容，先调用hasLength确定是否有长度，如果有的话，再去每个字符串是否都是空格。
     * 只要有一个不是空格就是有文本。
     */
    @Test
    public void hasTextTest(){
        boolean val = StringUtils.hasText("");
        System.out.println(val);
        boolean val2 = StringUtils.hasText(new String(" "));
        System.out.println(val2);
        boolean val3 = StringUtils.hasText(new String("a"));
        System.out.println(val3);
    }


    /*
     * containsWhitespace 判断字符串是否有空格，有的话返回ture，先判断是否有长度，如果没有直接返回flase，
     * 如果有长度则判断你每个字符是否是空格，只要有一个空格返回true
     */
    @Test
    public void containsWhitespaceTest(){
        boolean val = StringUtils.containsWhitespace("");
        System.out.println(val);
        boolean val2 = StringUtils.containsWhitespace(new String(" "));
        System.out.println(val2);
        boolean val3 = StringUtils.containsWhitespace(new String("a "));
        System.out.println(val3);
    }


    /*
     * trimWhitespace 去掉字符串两头空格
     *
     */
    @Test
    public void trimWhitespaceTest(){
        String resultStr = StringUtils.trimWhitespace("    你 好    ");
        System.out.println(resultStr);
    }



    @Test
    public void trimAllWhitespaceTest(){
        String resultStr = StringUtils.trimAllWhitespace("    你 好    ");
        System.out.println(resultStr);
    }


    @Test
    public void trimLeadingWhitespaceTest(){
        String resultStr = StringUtils.trimLeadingWhitespace("    你 好    ");
        System.out.println(resultStr);
    }

    @Test
    public void trimTrailingWhitespaceTest(){
        String resultStr = StringUtils.trimTrailingWhitespace("    你 好    ");
        System.out.println(resultStr);
    }

    @Test
    public void trimLeadingCharacterTest(){
        String resultStr = StringUtils.trimLeadingCharacter("你你你好",'你');
        System.out.println(resultStr);
        String resultStr2 = StringUtils.trimLeadingCharacter("你好",'好');
        System.out.println(resultStr2);
    }

    @Test
    public void startsWithIgnoreCaseTest(){
        boolean val = StringUtils.startsWithIgnoreCase("Hello","h");
        System.out.println(val);
    }



}
