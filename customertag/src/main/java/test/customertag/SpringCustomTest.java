package test.customertag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/7.
 */
public class SpringCustomTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        User user = (User) ac.getBean("testBean");
        System.out.println(user.getUserName());
    }

}