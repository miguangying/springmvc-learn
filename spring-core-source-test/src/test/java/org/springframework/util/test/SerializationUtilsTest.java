package org.springframework.util.test;

import org.junit.Test;
import org.springframework.util.SerializationUtils;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/17.
 */
public class SerializationUtilsTest {


    @Test
    public void serializeTest(){
        byte[] bytes = SerializationUtils.serialize(new User("我才是"));
        User user = (User) SerializationUtils.deserialize(bytes);
        System.out.println(user);
    }

}
