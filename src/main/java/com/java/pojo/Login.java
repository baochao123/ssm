package com.java.pojo;

import org.springframework.stereotype.Component;

@Component
public class Login {
    private Long id;
    private String uname;
    private String psw;
    private Integer age;
    private String gender;
    private Float weight;

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", psw='" + psw + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
