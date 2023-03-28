package com.example.magic;

import com.alibaba.fastjson2.JSONObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author free
 * @Date 2023/3/22 下午1:01
 * @Description TODO
 **/

public class Magic {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/free/code/java/examples/learn-java-demo1/src/main/java/com/example/magic/database.txt"));
            List<Data> list = new ArrayList<>();
            for(String line: br.lines().toList()) {
                String[] data = line.split("\\|");
                String id = data[6].trim();
                Data entity = new Data();
                entity.setId(id);

                String domain = data[3].trim();
                String state = data[5].trim();

                if (state.equals("0") || state.equals("5") || state.equals("6")){

                }else {
                    continue;
                }

                Meta meta = new Meta();
                meta.setName(domain);
                meta.setHigh_res_img_url(String.format("https://btcdomains.io/images/domain/%s.jpeg", domain.subSequence(0, domain.length() - 4)));

                List<Attr> attrs = new ArrayList<>();
                Attr attr = new Attr();
                attr.setTrait_type("register_date");
                attr.setValue(data[13].trim());
                attrs.add(attr);
                attr = new Attr();
                attr.setTrait_type("expire_date");
                attr.setValue(data[9].trim());
                attrs.add(attr);

                meta.setAttributes(attrs);
                entity.setMeta(meta);
                list.add(entity);
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/free/data/ord.json"));
            bw.write(JSONObject.toJSONString(list));
            bw.flush();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String dateChange(String register) {
        try {
            String res = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(register)));
            return res;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}


