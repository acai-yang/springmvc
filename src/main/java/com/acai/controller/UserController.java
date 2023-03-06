package com.acai.controller;

import com.acai.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:00
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/toJumpPage")
    public String toJumpPage() {
        System.out.println("页面跳转");
        return "page.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/toText")
    public String toText() {
        System.out.println("返回纯文本信息");
        return "response text";
    }

    @RequestMapping("toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO() {
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("acai");
        user.setAge(18);
        return user;
    }

    @RequestMapping("toJsonList")
    @ResponseBody
    public List<User> toJsonList() {
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("acai");
        user.setAge(18);
        User user2 = new User();
        user2.setName("liuliu");
        user2.setAge(18);
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        return list;
    }

    @RequestMapping("/date")
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

    //设置当前操作的访问路径
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody //设置返回值类型
    public String save() {
        System.out.println("User#save()");
        return "UserController#save()";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody //设置返回值类型
    public String delete(@PathVariable Integer id) {
        System.out.println("User#delete()" + id);
        return "UserController#delete()";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody //设置返回值类型
    public String update(@RequestBody User user) {
        System.out.println("User#update()" + user);
        return "UserController#update()";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody //设置返回值类型
    public String getById(@PathVariable Integer id) {
        System.out.println("User#getById()" + id);
        return "UserController#getById()";
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody //设置返回值类型
    public String getAll() {
        System.out.println("getAll#getAll()");
        return "UserController#getAll()";
    }

}
