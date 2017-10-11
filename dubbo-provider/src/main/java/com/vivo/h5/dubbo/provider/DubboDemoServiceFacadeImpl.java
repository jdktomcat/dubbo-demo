package com.vivo.h5.dubbo.provider;

import com.vivo.h5.dubbo.facade.DubboDemoServiceFacade;

/**
 * 类描述：
 * <p>
 * 创建者：汤旗
 * 创建时间：2017-10-10 20:06
 */
public class DubboDemoServiceFacadeImpl implements DubboDemoServiceFacade {

    @Override
    public void say() {
        System.out.println("Hello Dubbo!!!!");
    }
}
