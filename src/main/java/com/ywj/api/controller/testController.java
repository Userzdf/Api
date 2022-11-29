package com.ywj.api.controller;

import com.ywj.api.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class testController {
    @GetMapping("/test")
    @ResponseBody
    public Map<String, ArrayList> test(UserInfo userInfo){
        Map<String,ArrayList> map = new HashMap();
        userInfo.setUserName("lisa");
        String uuid = String.valueOf(UUID.randomUUID());
        System.out.println(uuid);
        userInfo.setPassWord(uuid);
        userInfo.setEmail("1443637646@qq.com");
        userInfo.setPhone("150**********");
        userInfo.setAddress("北京市朝阳区");
        ArrayList<Object> array = new ArrayList<Object>();
        array.add(userInfo);
        map.put("userInfo", array);
        return map;
    }
}
