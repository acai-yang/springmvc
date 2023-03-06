package com.acai.domain;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月06日 8:47
 */
public class User {
    private String name;
    private int age;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
