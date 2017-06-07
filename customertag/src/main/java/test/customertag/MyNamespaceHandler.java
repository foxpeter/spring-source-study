package test.customertag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by Administrator on 2017/6/7.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }

}