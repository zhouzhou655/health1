package com.itheima.health.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.health.constant.MessageConstant;
import com.itheima.health.entity.Result;
import com.itheima.health.pojo.CheckItem;
import com.itheima.health.service.CheckItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CheckItemController {

    @Reference
private CheckItemService checkItemService;

    @RequestMapping("/checkItem/findAll")
    @ResponseBody
    //@ResponseBody的作用其实是将java对象转为json格式的数据。
    public Result findAll(){
        List<CheckItem> list = checkItemService.findAll();

      return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, list);

    }

}
