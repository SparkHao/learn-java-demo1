package com.example.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author free
 * @Date 2023/3/20 上午11:29
 * @Description TODO
 **/

public class DealData {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/free/code/examples/java/learn-java-demo1/src/main/java/com/example/utils/data.txt"));
            List<OrdDomain> list = new ArrayList<>();
            int count = 0;
            for(String line: br.lines().toList()) {
                String[] data = line.split("\\|");
                String id = data[1].trim();
                System.out.println("domain: " + data[3].trim() + ", state: " + data[5].trim() + ", registerDate: " + dateChange(data[9].trim()));
            }

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



//img_url | expire_time   | cost_fee | out_wallet | fee_rate | create_time   | update_time   |

class OrdDomain {
    public String id;
    public String walletId;

    public String domain;

    public String domType;
    public String domState;

    public String inscribeId;

    public String txId;

    public Date expireTime;

    public String outWallet;

    public Date createTime;

    public OrdDomain(String id, String walletId, String domain, String domType, String domState, String inscribeId, String txId, Date expireTime, String outWallet, Date createTime) {
        this.id = id;
        this.walletId = walletId;
        this.domain = domain;
        this.domType = domType;
        this.domState = domState;
        this.inscribeId = inscribeId;
        this.txId = txId;
        this.expireTime = expireTime;
        this.outWallet = outWallet;
        this.createTime = createTime;
    }
}