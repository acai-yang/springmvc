package com.acai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:00
 */
@Controller
public class UserController {

    //设置当前操作的访问路径
    @RequestMapping("/save")
    @ResponseBody //设置返回值类型
    public String save() {
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
