package com.goudai.proxy;

import com.goudai.service.MockService;
import org.junit.Test;

public class ProxyTest  {

    @Test
    public void proxy(){
        CGLibProxy proxy = new CGLibProxy();
        //返回了包含横切代码的子类的对象
        MockService service = (MockService)proxy.getProxy(MockService.class);

        service.doService();
    }

}
