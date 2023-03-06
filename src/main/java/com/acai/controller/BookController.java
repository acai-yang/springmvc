package com.acai.controller;

import com.acai.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:00
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {
    //设置当前操作的访问路径
    @PostMapping
    public String save() {
        System.out.println("User#save()");
        return "UserController#save()";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("User#delete()" + id);
        return "UserController#delete()";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("User#update()" + user);
        return "UserController#update()";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("User#getById()" + id);
        return "UserController#getById()";
    }

    @GetMapping
    public String getAll() {
        System.out.println("getAll#getAll()");
        return "UserController#getAll()";
    }
}


