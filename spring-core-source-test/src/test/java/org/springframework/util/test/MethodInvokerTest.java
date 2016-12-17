package org.springframework.util.test;

import org.junit.Test;
import org.springframework.util.MethodInvoker;

/**
 * Created by Administrator on 2016/12/17.
 */
public class MethodInvokerTest {


    @Test
    public void test(){

        MethodInvoker method = new MethodInvoker();
        method.setTargetClass(User.class);
        method.setTargetMethod("getStr");
        Object[] arguments = new Object[1];
        arguments[0] = "水电费";
        method.setArguments(arguments);

        try {
            // 准备方法
            method.prepare();
            //执行方法
            Object result = method.invoke();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testStr(){
        MethodInvoker method = new MethodInvoker();
        User user =new User("二手房");
        method.setTargetObject(user);
        method.setTargetMethod("setName");
        //下来可以自己手工设置方法参数
        Object[] arguments2 = new Object[1];
        arguments2[0] = "test2";
        method.setArguments(arguments2);
        try {
            // 准备方法
            method.prepare();
            //执行方法
            Object result = method.invoke();
            System.out.println(result);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
