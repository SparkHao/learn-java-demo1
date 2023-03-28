package com.example.data;

import java.util.List;

/**
 * @Author free
 * @Date 2023/3/22 下午1:09
 * @Description TODO
 **/

public class OrdData1Entity {
    public String name;
    public String inscription_id;

    public String high_res_img_url;

    public List<OrdData1Attr> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInscription_id() {
        return inscription_id;
    }

    public void setInscription_id(String inscription_id) {
        this.inscription_id = inscription_id;
    }

    public String getHigh_res_img_url() {
        return high_res_img_url;
    }

    public void setHigh_res_img_url(String high_res_img_url) {
        this.high_res_img_url = high_res_img_url;
    }

    public List<OrdData1Attr> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<OrdData1Attr> attributes) {
        this.attributes = attributes;
    }
}
