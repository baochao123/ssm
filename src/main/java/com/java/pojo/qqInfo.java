package com.java.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class qqInfo {

    @Pattern(regexp =".{3,12}" ,message ="3-12位任意字符" )
    private String name;
    @Pattern(regexp ="\\w{6,12}" ,message ="6-12位数字或字母或下划线" )
    private String password;
    @Max(value =150,message ="建国后不许成精" )
    @Min(value = 18,message = "未成年人")
    private Integer age;
    @Pattern(regexp ="1[35789]\\d{9}" ,message ="11位手机号码" )
    private String phone;

    @Override
    public String toString() {
        return "qqInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
