package com.vivo.h5.dubbo.controller;

import com.vivo.h5.dubbo.facade.DubboDemoServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ��������
 * <p>
 * �����ߣ�����
 * ����ʱ�䣺2017-10-10 21:19
 */
@RestController
public class DubboDemoContrller {

    @Autowired
    private DubboDemoServiceFacade dubboDemoServiceFacade;

    @RequestMapping(value = "dubbo")
    public void visit(){
        dubboDemoServiceFacade.say();
    }
}
