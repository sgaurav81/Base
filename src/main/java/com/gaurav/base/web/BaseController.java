package com.gaurav.base.web;

import com.gaurav.base.data.BaseData;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @RequestMapping("/v1/data")
    public BaseData getData(){
        System.out.println("In");
        BaseData baseData = new BaseData();
        baseData.setId(1);
        baseData.setName("Globe");
        return baseData;
    }

}
