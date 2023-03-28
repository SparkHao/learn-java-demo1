package com.example.data;

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

public class OrdData1 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/free/code/examples/java/learn-java-demo1/src/main/java/com/example/data/database.txt"));
            List<OrdData1Entity> list = new ArrayList<>();
            for(String line: br.lines().toList()) {
                String[] data = line.split("\\|");
                String id = data[1].trim();
                OrdData1Entity entity = new OrdData1Entity();

                String domain = data[3].trim();
                entity.setName(domain);
                entity.setInscription_id(data[6].trim());

                String state = data[5].trim();
                System.out.println(state);
                if (state.equals("0") || state.equals("5") || state.equals("6")){

                }else {
                    continue;
                }
                entity.setHigh_res_img_url(String.format("https://btcdomains.io/images/domain/%s.jpeg", domain.subSequence(0, domain.length() - 4)));

                List<OrdData1Attr> attrs = new ArrayList<>();
                OrdData1Attr attr = new OrdData1Attr();
                attr.setTrait_type("register_date");
                attr.setValue(data[13].trim());
                attrs.add(attr);
                attr = new OrdData1Attr();
                attr.setTrait_type("expire_date");
                attr.setValue(data[9].trim());
                attrs.add(attr);

                entity.setAttributes(attrs);
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


