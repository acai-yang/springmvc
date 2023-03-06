package com.acai.controller;

import com.acai.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月06日 16:06
 */
@RestController
@RequestMapping(value = "/cases")
public class CaseController {


    @PostMapping
    public String save(@RequestBody User user) {
        System.out.println("CaseController#save()" + user);
        return "save success...";
    }

    @GetMapping
    public List<User> getAll() {
        User user1 = new User("acai", 18);
        User user2 = new User("liuliu", 18);
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        return list;
    }

}
