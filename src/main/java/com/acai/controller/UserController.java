package com.acai.controller;

import com.acai.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:00
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //设置当前操作的访问路径
    @RequestMapping("/save")
    @ResponseBody //设置返回值类型
    public String save(User user) {
        System.out.println(user);
        return "UserController#save()";
    }

    @RequestMapping("date")
    @ResponseBody
    public String dateParam(
            Date date,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2) {
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);

        return "UserController#dataParam()";
    }
}
