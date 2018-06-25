package com.example.demo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created by huangzhiwei on 2018/4/3.
 */
public class User {
    @NotNull
    Long id;
    @NotBlank
    String tt;

    public Long getId() {
        return id;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
