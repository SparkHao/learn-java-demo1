package com.example.magic;

import java.util.List;

public class Meta {
    public String name;
    public String high_res_img_url;

    public List<Attr> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHigh_res_img_url() {
        return high_res_img_url;
    }

    public void setHigh_res_img_url(String high_res_img_url) {
        this.high_res_img_url = high_res_img_url;
    }

    public List<Attr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attr> attributes) {
        this.attributes = attributes;
    }
}
