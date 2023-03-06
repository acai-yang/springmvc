package com.acai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:00
 */
@Controller
@RequestMapping("/book")
public class BookController {

    //设置当前操作的访问路径
    @RequestMapping("/save")
    @ResponseBody //设置返回值类型
    public String save(@RequestParam List<String> likes) {
        for (String s : likes) {
            System.out.println(s);
        }
        return "BookController#save()";

    }
}
