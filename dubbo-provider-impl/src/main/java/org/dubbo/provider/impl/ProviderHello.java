package org.dubbo.provider.impl;

import org.dubbo.provider.api.IProviderHello;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service
public class ProviderHello implements IProviderHello{

    public void providerSay() {
        System.out.println("provoider hello");
    }

}
