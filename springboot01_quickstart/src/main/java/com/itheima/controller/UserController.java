/**
 * @description: rest风格使用
 * @author
 * @date 2023/2/18 11:37
 */

package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public  String  save(){
        System.out.println("user save。。。。");
        return  "{'moudle':'save'}";

    }

    @RequestMapping(value = "/users/{id}",  method = RequestMethod.DELETE)
    @ResponseBody
    public   String  delete(@PathVariable  Integer id) {  // PathVariable  表示从路径获取参数
        System.out.println("user delete...."+id);
        return  "{'moudle':'delete'}";
    }

    @RequestMapping(value = "/users",  method = RequestMethod.PUT)
    @ResponseBody
    public   String  put(@RequestParam Integer id) {  // RequestParam  用于接收请求体中的json参数
        System.out.println("user put...."+id);
        return  "{'moudle':'put'}";
    }


}
