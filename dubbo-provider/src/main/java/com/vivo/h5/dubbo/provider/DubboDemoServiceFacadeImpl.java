package com.vivo.h5.dubbo.provider;

import com.vivo.h5.dubbo.facade.DubboDemoServiceFacade;

/**
 * ��������
 * <p>
 * �����ߣ�����
 * ����ʱ�䣺2017-10-10 20:06
 */
public class DubboDemoServiceFacadeImpl implements DubboDemoServiceFacade {

    @Override
    public void say() {
        System.out.println("Hello Dubbo!!!!");
    }
}
