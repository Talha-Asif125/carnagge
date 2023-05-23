package com;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "obj")
public class hello {
    String name="Venom";
    String age="Confidential -_-";
    String phone="Sorry!";

    public hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
