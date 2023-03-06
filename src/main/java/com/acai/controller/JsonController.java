package com.acai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月06日 9:23
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody List<String> likes) {
        for (String like : likes) {
            System.out.println(like);
        }
        return "JsonController@save()";
    }
}
