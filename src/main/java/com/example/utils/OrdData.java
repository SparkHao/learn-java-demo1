package com.example.utils;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author free
 * @Date 2023/3/13 下午4:31
 * @Description TODO
 **/

public class OrdData {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/free/code/examples/java/learn-java-demo1/src/main/java/com/example/data/database.txt"));
            List<DataOrdStruct> list = new ArrayList<>();
            int count = 0;
            for(String line: br.lines().toList()) {
                String[] data = line.split("\\|");
                String id = data[6].trim();
                if (id == null || "".equals(id)){
                    continue;
                }
                String name = data[3].trim();
                MetaData meta = new MetaData(name);
                count ++;
                System.out.println(id);
                DataOrdStruct dataOrdStruct = new DataOrdStruct(id, meta);
                list.add(dataOrdStruct);
//                System.out.println(JSONObject.toJSONString(dataOrdStruct));
            }
//            System.out.println(count);
//            System.out.println(JSONObject.toJSONString(list));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/free/data/inscriptions.json"));
            bw.write(JSONObject.toJSONString(list));
            bw.flush();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class DataOrdStruct {
    public String id;
    public MetaData meta;

    public DataOrdStruct(String id, MetaData meta) {
        this.id = id;
        this.meta = meta;
    }
}

class MetaData {
    public String name;

    public MetaData(String name) {
        this.name = name;
    }
}

//        | helloworld.btc        | 9744b01200e1d4221b156d6f9aecee6cf616e97f5ba113dd59d0a2ec15390ca1i0 |
//        | btcdomain.btc         | fdd33361b82d699804eff14dd54f17a3524a9c643f51e0a6fd72ec2561b02077i0 |
//        | satoshi.btc           | d5aa645a26e3e32d229ec6766c62ec19f8a737cf97497cca1e9be06faae27ac1i0 |
//        | vitalik.btc           |                                                                    |
//        | 00000.btc             | 2d0eba1a03ec9b4279731420263c6f9424e9f8f895ac80965aa87f0066dadfcai0 |
//        | 1111.btc              | f7465d25f63b30240c9b96089142db7af95039e4340e4cf546079e08ec5e7267i0 |
//        | 6666.btc              | df452c33db333b678a68c6dda257b700177843dfe7d43c0375bc83c61b03871di0 |
//        | ohmann.btc            | aa2eaca03a4878fcbaa39ed66e6b576554e1f6a2e2e5b8dabf7c783062be2c55i0 |
//        | xinyi.btc             | 7926f21e9f2dc2980330c87d61fb70e4aea732a10f7c27f7fb3e141df8406071i0 |
//        | 8888.btc              | 47e761d937ba90cfd1571e7689330ffb683ac87f8b30b3ff6da656a0f7a162e4i0 |
//        | 0000.btc              | 9792785cec6ab6750c32264c5326f0539f03b5cae604e5a704e5d891958cbac3i0 |
//        | cointiantian.btc      | e56c100a80632ae899457ba9b265c88ab89c5ffbc799044d9768897754514b16i0 |
//        | 1888.btc              | c76299f85432f66b9ebe1b5b4f767a6e6842e841020d5e2d29dbbfc98852bd74i0 |
//        | 0xb17.btc             | 0f8a6c84dc905e6dd96fea41966221d9070eff0146aa1333f375c74c94d65657i0 |
//        | 3333.btc              | e6a54f637e2a969c9dc3a092255221eb051eb314ad073b018fbfb7bdf43a0662i0 |
//        | 2222.btc              | b3ae5c99c861575fad356b10664c8a0e9dc740b6cb5066d41cea0d9ee00509eci0 |
//        | 9999.btc              | 71c7d46a2a1c3cb55af8803d732d7e9f95298b7c4552dede1510a4ca701455bdi0 |
//        | 1234.btc              | fe8870026edd082e88d655918818aad7f3f2ae42f7640bddcfb0692c15ee2aebi0 |
//        | 5555.btc              | 8aab7e5e89b8b44166fb05fc68b68b54faee286e44de1a8ecb9e407e575c3072i0 |
//        | 7777.btc              | 635f60bee332ad2143e43681c6c5d3b22ca167db770924563e9e300863f80d7bi0 |
//        | andy.btc              | 4f0af89c33bd1593935f7047bbe6b40a9aa9c18dd35ec84372f5c005c045a909i0 |
//        | 1314.btc              | 4132b4c946b0080ae344ae3c92c24fbe4a2f1b5931d8c558e0f31b4dbf3c0446i0 |
//        | 6789.btc              | adc0d913fb254d66b7c3acad0d68617ec245751e2236c1fdba8e48aa8258dd1ei0 |
//        | 4444.btc              | 6e47c5abcff99175aecafbc14031cf53c60052d58400e70acd591a85fb2bb814i0 |
//        | 123456.btc            | 2d4cf18cdca7eb37ea51dd0dedc9a3f905d5683ef65c2e6faf08d6629d0b4f07i0 |
//        | bitcoin.btc           | c47f10993e3769142c7a147a94afe1c6dd9289318d3870dfcfdbbbe94932583ei0 |
//        | 666666.btc            | 0775901cacc7b932d0b3b6601f22192081979629c1c7cf0a0583bc646cd64648i0 |
//        | 000000.btc            | f0d0819616241752be5271b43ad53d9aa2ecff0fdd6bc4227c9e7dd15380e72ai0 |
//        | lebron.btc            | 9cb0d981e3bcfcd6797f51da49221c39824cd448b89a6f55f77f9e931deef74ei0 |
//        | 8848.btc              | fa1603884f94e1335a97ad4f5c012d8883faf39383c54c6172f8126c77f5e5a8i0 |
//        | 0001.btc              | 60d134468b689e8d2802651ba54c72e3124a870ff617e292bb95b8667de6d55bi0 |
//        | 0009.btc              | 8eb425c70fe2e0c331effe6b49fd267bb5f3b5706bfe459fa2fb3f1a3c3066c8i0 |
//        | 7878.btc              | 9b0cd29c57228e7b7bf85170b5c21a2cb40f8cd2887578d6fe7e94cb2590f007i0 |
//        | 6688.btc              | a498d9768995a0c9e22ab7dd34c2787dcea77fe8c2b52f592a3523d0259512fei0 |
//        | 0123.btc              | 003f2b3dfe84db7cec288e82beb96c3d27e67fd784ded9b2e35cc9abf85b7a94i0 |
//        | 4567.btc              | f17c6e57f385251e586378dd92ce76d78c39ccf2e7823fb250f43e997c6e0426i0 |
//        | amazon.btc            | 73d8d8789b3858abf25ac01274ef5423dc506397fcf710d30b838bf75f3ef452i0 |
//        | 2345.btc              | 8caa8bd3d464e38fa2f978db785c4507474d7fe799063ec703ce3ff0de3a2319i0 |
//        | nike.btc              | 8fa0d2ded210782dcbf7fd8217cdb992fd5588048524c63eacf58a5c208a36efi0 |
//        | 1221.btc              | 315e7cf86b7f4a4118f8d0178bf97235d35cb56d64b8ee7580999e2e7dec6d54i0 |
//        | 888888.btc            | aa1ec981ba9a046be2f8ba00bd470db327d7e4e16540639fb2e1b69a54a1e547i0 |
//        | free.btc              | 01a22903bf8ba76d68edd1d1cd344178591713ffc7ce718a12704e1135da5126i0 |
//        | 999999.btc            | 62f92747534e20d04e047934b23cd2cca3c7f8de5ba1b8f843a115784e034f5ei0 |
//        | love.btc              | dc11302aa3966dc00789b28e4a73e891613a8efbb14d3dcd80d49e78400bfb2ai0 |
//        | 88888.btc             | 87be70de24dd67c8e3fa45201dcb14b23016ceb98ed9729d9362e1204e6e31e1i0 |
//        | 5678.btc              | dfca5010b9eed1af94e0cebe9f00bc0f0b6dbfbeebb1ea29a3ffe6a3fc0d83cci0 |
//        | metaverse.btc         | f0e7377ee47b3cd1634cae4fc36802798656b8fc537c73e3b381e1e6c909b2eci0 |
//        | 0002.btc              | d31a5a1c5860a3ed0b8711a344f8971fcfee0ccf534d454e5988a6a456a01102i0 |
//        | twitter.btc           | eb857b7287059f79468ab68bd9095675c66e0e9e1de1d53efbee8b4a9b1aafe0i0 |
//        | 1984.btc              | 46f0fdc7eff8a89cdf9e2e93e9391740f6ebc5b64deea0b7d2265fa7d17d96a9i0 |
//        | 1688.btc              | 8f2cd690280f5b3ba44555fd2d50e0b85826d0d5aac78b035572505b55e7cdf3i0 |
//        | paradigmail.btc       | 66ae71e9a1126dddf0d959e37ca35f53a0d25a9766c9fb26d30ce847e6baec03i0 |
//        | 66666.btc             | caf15305ea70005c12fb54b4fdfca57c833e752c022a50b65af7a989f98197b0i0 |
//        | cryptoxingkong.btc    | 677109105408c60e1d8c5017ad0626fd5e4637753d6d053e97075e868c4ab7abi0 |
//        | uniswap.btc           | 6daa849fcabbc6adcfd35a311c5e51f59738c24de195a3b82d43d5581f1473a6i0 |
//        | binance.btc           | 92858cbec82f8e3a47d4a977833e894c776a3d83bf8bab824cc39193b863e100i0 |
//        | ordinals.btc          | e9cdff97f9cf9a3e250ef1f6cb81b382e529aac3f3d3a6e70da3df2a01fce63ai0 |
//        | alphabet.btc          | 7b372ea5425c7e7a0fd27ac0fcbf6cd6356a1d7aa74b6380e6665668cbe5d518i0 |
//        | 111111.btc            | 1320d34d45ae252a36f522af1f1cea009ad9caf902c71fcf869a9acb91039e9di0 |
//        | chatgpt.btc           | 8c3cbf40e56434c0d65be3a035e45a0a7f067a50e70f16a0670e13207c970d17i0 |
//        | hermes.btc            | ad494367f2a159e9d3fa4b0fa637f9b5c0f0fdc17c1c470a11062c390ebf2a58i0 |
//        | casino.btc            | 477ec369e6346c4b77481ce2e9edff52c740f82164b98a8e2bd6206aa8bdfcf4i0 |
//        | michael.btc           | d29962ea53d697ac0db221b3d1499372f86adde94c7c9bb60e4c05c1ec04ebb3i0 |
//        | opensea.btc           | e22651aa6807f1318fe7eb0dd83cba00433e232b059ea64913726e859338e01di0 |
//        | youtube.btc           | 5c8bd14dff8f002a87314079c97849e6ebb30355719ba03f39b3804ef87f7773i0 |
//        | btcoin.btc            | ea55d6867c2ac74cfc7c77feb3046c30e404951bc8ab9c25fae0392c24d05103i0 |
//        | 00001.btc             | 8971f6b9ea2579e5af0a64fc94c457567741431224ecdf68c42b44f8e31b219ei0 |
//        | ray2768.btc           | b40f17e6ada373bd669c9dd39a46bc9c7f1d2dd96eee003981896bd0613d741ai0 |
//        | donaldtrump.btc       | 57eb523f2a3069978552ce7e9d07590223a2d0766ffeac0e33fe8d661d590d57i0 |
//        | paradigm.btc          | 91f6bb45797c627ad1f876a401fdb278fe597524fdf764f8245618f605eb1a73i0 |
//        | oasis.btc             | 38868ac9bd5b6dea244572a6d55adf84d837d1feb61d439293a31d51a0f91be9i0 |
//        | microsoft.btc         | db2bb5d236447e5dc3b4ff40ec45e06e62652cf8f74ff0c03cdbd78c38435aa5i0 |
//        | 10080.btc             | 063f32b5bae1fae31666edf5dff98048e63c54a748e7d438f11e2745fdc927cdi0 |
//        | 10900.btc             | 1854d40f6d13ed544fd8a34c791eb4629368e0ada94e13aabba5eda17c7a22fai0 |
//        | 222222.btc            | 12a6eb0e13c9a40df0589b53e1b6f2236ade8e2afd1d2c43639743b5dd2af0c2i0 |
//        | 11111.btc             | aadb91e98bca95713cc752e86998d6f54d5ee37b4554f68b8f871ee90a84b81ai0 |
//        | a16z.btc              |                                                                    |
//        | arringtoncapital.btc  | 08affee4db73491cea413ada0a4d864f66255c719b32e1e2ed7fba33e2c26e84i0 |
//        | blockchaincap.btc     | b33aa4c5ce104de3a2e2ec842218036316770d3b6aa5ea23a6fe27f458682d74i0 |
//        | 99999.btc             | 1716af8bf188ecae6e1d23beb9d8c26536bb6b612b731a1d030309f0a0171efdi0 |
//        | blockfi.btc           | 2e922e3933af3ef9f253038a5ca3c0d24535064f613946ad03394793b4f51f45i0 |
//        | 77777.btc             | 5592dfd5baa14cafe0cb78c64f93ae09ced064eddfafc17f638d2d84741e7dbai0 |
//        | 55555.btc             | fcaeabb2c5586c77f57facf831dd669b2ce9f29b3a78217287b6db0a5fafee2ei0 |
//        | blocktower.btc        | 96ba2bf090217b0f859af2313a9a70ce57f6eb642424ef68e2ba432721b7467di0 |
//        | boostvc.btc           | c0d027736ee628ed9cb7be74ebc700d6151c6b79c81baa04bee50ab67b4f6666i0 |
//        | castleislandvc.btc    |                                                                    |
//        | coinfund.btc          | aad0afc4c3a96d745fc2b1aceaaa0a5761fc78c58bd2140c11c51e5b4ef54bb0i0 |
//        | 22222.btc             | ab81c396b2bdadd69f1c2ce10b21bf15e6cb42007bdce79be74def693edc4c51i0 |
//        | coinbase.btc          |                                                                    |
//        | dcgco.btc             | 5ecae57fcfdfc0f7e2e73b4adc82f5bbaaea9a576da7eeabef5aeaa761a14c22i0 |
//        | fabricvc.btc          | 1737dd8e877cf6bc24509f27daca677999c1792677565d58958d354b0275af82i0 |
//        | fenbushi.btc          | 8364cdc06e1e1c1cd42a90243012fd3628c4fafb4e9cb00b5e492976edae5d54i0 |
//        | foundersfund.btc      | c9e1b88b1dca7bf419496fdcab2bf2a658f3bc6219620ec2661538374c1113a0i0 |
//        | galaxyhq.btc          | df7ad2d785057b5a5bebdab37131da2da9821f1b0b7a5fbdad076aa78b68a0e8i0 |
//        | hashed.btc            | 37446c95096fef8eb3d64afed3d353fbaacdbe55b229bfde08c8d0d58da133c1i0 |
//        | initialized.btc       | ce61e4c08f64f7726868c53679d15f190fd24d843d9001ad4fa3a9472e292024i0 |
//        | hashkey.btc           | 8be768edcf2489f86e0901062b45028a5fd057a8d3d07b58aa3a967f46f279a8i0 |
//        | hashkeycapital.btc    | 7fb65aa11befee8ec2219040b53235e1f0e47e7327ed7cb84d7dd0cd2a8e5ab1i0 |
//        | samsung.btc           | 5237f6ee125ec52cc8a868b79d85efb72044404864e06546d675f7eb4ef222e9i0 |
//        | adidas.btc            | f01093eb6e0442f7ac344c546a3af97ae01ba1aff6eda06b302294899db67d1fi0 |
//        | gucci.btc             | 43a4203ec0c9493660bae44ef787ba0e897418feac252b7c4baf57e788193e9di0 |
//        | porsche.btc           | 805173cc57556bf7834d5395c86d1b8d1aed4f0882c59e1dc6ff84bc11731313i0 |
//        | yying.btc             | 2755e0a5fac07a7ce2c10185d445ee8feab73d82c538a834e273021c52d57c7bi0 |
//        | pepsico.btc           | 802b60edf681dba5baee7fcec1180f0b12b84a72b74f4a80f7078363d73f1adai0 |
//        | yy1360123.btc         | 5e365315b98aba6f11857f5b300c10c59be6269423b11b0cf8619f28c5ac0456i0 |
//        | louisvuitton.btc      | 6a67b19796a247a15a592378b0a4fd0af989c6250f57c334007121740f69af59i0 |
//        | ferrari.btc           | 9430c1aee62e2cbe6455ad7417cc28c3457e609f954b339d16de7640cedc1bb2i0 |
//        | lamborghini.btc       | bd4a1b1c2634103dda215b8261aa4e9026f48a991136dcaf5583acfd80cb4174i0 |
//        | apple.btc             | fb65f7524f8509fd68c1ac4fc172f92d05f9a348b4f5ff3b754408a747154be6i0 |
//        | ania.btc              | 70a1aea6f524a9698c1c9982a0e448a801a95942ebfbab0ffe5181d6a5f8f12ei0 |
//        | walmart.btc           | f62d11fa0b6c1f1256821fa53ff885721830526f967c4bfb538e323ffc9d97aai0 |
//        | nestle.btc            | 920f04cca8bf3ca430321091a7f556e7f1ae5de1b72a63fb5e578d0eb5d02cdai0 |
//        | boredapeyachtclub.btc | 088e63a4fe7247808d2a3fa2ce7b409b7b4bd1596cfc80defbdb3d191cc1ca52i0 |
//        | 49586.btc             | f6133e7587a56d334b1453bd4a8fd8a1db49a83c64a905cf017af5fb1f997789i0 |
//        | coinmarketcap.btc     | 7b96938d783cfde2e9b54590aca98a3f5999a18005f7c3b2f011ec545200d32fi0 |
//        | jpmorgan.btc          | 7438ac24718279464669186fa496d9b7ae1cbb7e3431cdd96d084a0888d4b703i0 |
//        | cryptopunks.btc       | e9f9b9b3d71a69ffd29524ba1340a0a7fc0e09dd8e90d24ebbfdd24b0865ec8fi0 |
//        | joebiden.btc          | f0832fa2c5f6a3c9a1ba469cc251f6ec35e260f5eeafb71aee2b7afe3d894748i0 |
//        | rolex.btc             | 0b2f99aded9cd9f3fdfd6db418b0cd4f76b0405f996e2ee5a58170598425c1d4i0 |
//        | ssv8.btc              | 0dcb74a938ef17a4486957dab88fdb99ee44ee6b0acf684ef8a1fa04504592b9i0 |
//        | 123456789.btc         | d18d4b80b1ffff0deebe13cdb097d1d495ef25f7f3758bc2531788aa7297c960i0 |
//        | 12345.btc             | 70205f59a2274e2192a57ef65e3eb3c75d7e286bd6a98fa17a1333ee4d011b2di0 |
//        | 5201314.btc           | d2e172c7aad8a9ab0cb2d5a76e6bb2dc3cb017f3544a257f1f6e3ec339107e6di0 |
//        | google.btc            | e9f90220242d4bead4bbc7021749d14e18b1980a47304f86f634b9b003e664a8i0 |
//        | bayc.btc              | 7489173cd00f447ac7b6bcf33164c93a5ea054aa2933bc3c6e7b7c2432fc165fi0 |
//        | punks.btc             | c6ce1f3b11da7f0a986fb05defabbfb53772e1cb294bbc462045f508e45080f5i0 |
//        | chanel.btc            | 6ef27007ca29409cdfa7c22cfbd0099d07e81cbd5782f8f112652deec396d8d2i0 |
//        | doodles.btc           | 63f5b24695532f2af7da48b8943745d0218ee4611ed8773222ac950e3f2ae042i0 |
//        | azuki.btc             | 7df6df78458088eb576cfaadb01e4034fad3221763c6afac7028bb4a98dbef29i0 |
//        | sandbox.btc           | 92434b7490e37290b4e1a183dee1b778be6b92256aa54d790d066480b5b01f34i0 |
//        | elonmusk.btc          | 75689e6084990f075de45c68c0409fd358ca6ab23f889063b5a46496994fe837i0 |
//        | justin.btc            | d48a742f224cbf374f231c6c5140629760aa603db49ff249c6bd9e16d7c8c68ei0 |
//        | justinsun.btc         | d285e085de2309102dac0940fcdab0eb2c698b941c87db4fc82ae1ab65f4d61bi0 |
//        | bitget.btc            | a1b500d61c000b0afcc21d694087e5b4c1738626143567620f4b3774da34cc1di0 |
//        | dove.btc              | 93d1e812f0e55a2ff75faf97fbba2625f3ceec40da31ee40d0aadb9c4802b61ci0 |
//        | 9876.btc              | c78f6d7c732cd5bd51ba0c0fc13cc377834b4fd2e28394dab94c19220c631d4ei0 |
//        | 7777777.btc           | 1664528fd7c36921249dbdae88a0ae45c02a37531a7cabbf70f334981e7fdc91i0 |
//        | 88888888.btc          | 77800a15d3fa6dec130dd13344aed8c8b0d115f32155b5181e19c6c08057081ai0 |
//        | masayoshi.btc         | f9883f71a2b59b63c20424dab4a7cff73d8962e2c67c21b88eecefc67d8be3a0i0 |
//        | twelvefold.btc        | da137488bc7fab05ffd33c0f1211eff11a0221fb37396bc24bf89ec56d63a91di0 |
//        | 2888.btc              | 0b3573f66bbf03df22dd0c8ebe7f6d3957b01513cf6324f17dacdb6c1a6e5762i0 |
//        | yugalabs.btc          | 04bd0c5f9162801105d6497552da2545eed16ff3fc74f6790ca4d0a796f234c2i0 |
//        | 688888.btc            | 9a70a56d5980cabd2de442a4c3beb81dd518c7196a79980cd03d47cf35df5ed5i0 |
//        | otherdeed.btc         | 5db26b88220f81f0dc7b164d4c46040e6e097e2d7e285daeff622178d959c1c9i0 |
//        | moonbirds.btc         | 2be27b7c6e053ea2f509ed96075dc393417776cbfe155b7c46035634f4735beei0 |
//        | clonex.btc            | 691dc8a6ec31cc873440f649a85f2cdf76f34c18377f65edbb50429cb38ea404i0 |
//        | digidaigaku.btc       | 8892ddc2aaeae5fcdc46c8529b71890a7066502c1591d465beecf3b1f9e5f6f2i0 |
//        | cartier.btc           | 7315c55824d586f3e6b8cbf33868d7c0d58ac52eec6ea69533a4688e4d9ee382i0 |
//        | versace.btc           | 614ddb2c433219f59b7258c45d22f081891630299de0f4da5f06dc3331bc5f35i0 |
//        | armani.btc            | 0ee233a33a27002628e72c45fca723fca1d103c42f349df97655405e12f5defci0 |
//        | rollsroyce.btc        | 7e585e25f1f2578c395618928119b062f28a7f2d152c58744b353b6f49bf09dci0 |
//        | bentley.btc           | 3bf053191be49146db029ea8f8472e0691b43d8997be30a61d4bff276d3b301di0 |
//        | maserati.btc          | 2a8c7b34ad84bea12cd9a2ca4ee7cdf8ceda6aeea53327bead3073e8a5573d50i0 |
//        | astonmartin.btc       | 51a23d50a232068466ba23ebe51dd6f57b8f290bfc29a3fce18186a8c8dbba3fi0 |
//        | bugatti.btc           | 14dedf635d28d6803b6e92d4adc8b3c8c1690907ae80d56ffca0d59683fd2f48i0 |
//        | tiffany.btc           | 27a5916ebf161b920f00279b0f4c689165f372f611fba38ff089dd55ff258f98i0 |
//        | patekphilippe.btc     | b95fdd3e5ec2c5c8399164404a33e5b4b0cc7a97a8f081bb5594a76eee50d642i0 |
//        | lancome.btc           | 9e0a9d489ced2cc153c855f4004679b816bcca8c9fb35c9f4d48e2fc5286a554i0 |
//        | huobi.btc             | 5e3d3441f8a0c824fabd30b238ac51bac3bc4bee355bad675e067c6bfac24ce4i0 |
//        | tiktok.btc            | babcb244c5e859241eb53698714ef6319a3eb0ceebb0a96a9dddd601c2d342d5i0 |
//        | mercedesbenz.btc      | 4d90d3b9daa1b28e45c8c83b265a8a894ea08606c687d55de0d475a9698178f8i0 |
//        | starbucks.btc         | 475d48e7e9352c1045621b0e2d1b5a435e35e747a6015b3c1cbe716e750256fci0 |
//        | wechat.btc            | 38299de87bad7ef876208a5339794cef6f4a1bcc70d71b328bf8e13f996579b9i0 |
//        | disney.btc            | a0b8d21d6914d6a01298a9bd74a26e01c02a1ee1af19fd67ac0186a75800102ci0 |
//        | bybit.btc             | a22445bccd11c46cfdbb36bebb2c7af84233efd5d60372156ba2747699df9984i0 |
//        | tank.btc              | 34aeb87384d095e892daeb38f07ee12779d85421d1f93869e42766eaf1784ffbi0 |
//        | instagram.btc         | f6687895696a63a69a4d35774244e99bac27600db03c23d2fe11d78b2dfd9a86i0 |
//        | huawei.btc            | 1885d34d09c71028507ea20f86d9ebb86c72be76b174a60964ccba5716b90650i0 |
//        | tencent.btc           | 0351ce45902728ea9626db1a497373babd50216567c80668c807cbf7fa7d81b7i0 |
//        | taobao.btc            | 97c890a5418e36645e9fdd0bc2f14d238ac56035a0a014c522bdb6f9f1392cf6i0 |
//        | facebook.btc          | 38f563b56158dbc617c71c4a650a7437ba30b46834ddb3580cb494c8d7e5ffcfi0 |
//        | alibaba.btc           | a46b4a0822846035d882f84c37e1ffb55a7b20664d777503a442a38441040264i0 |
//        | pudgypenguins.btc     | e05a59367b1731d4ea2058c4081f7f6dd1deadd71683c0a2704d2e46bf86250di0 |
//        | otherside.btc         | 0750e3a974de1eab36f592fe4ef811367aaebba7097059ae4255d9ba79329188i0 |
//        | looksrare.btc         | f1d17fda7e956cae8cb63580ff465cae84b56e11f16e84f61e077f4722ffa5a7i0 |
//        | discord.btc           | b78e56cb85969ceeca2493b406a06f90735e2c7da4c300a0eaaf77223a8676bai0 |
//        | 1000.btc              | 20cdcafe4a00d27ff0f0beb594d24097c3bc016b287b184fa134495592c72c3ai0 |
//        | 33333.btc             | 56d08b159ab8072ae546fb441baf9d07d9018ada23590e3ad8f620fb07e065c6i0 |
//        | 44444.btc             | dbee213d2a3c87df79a6e45a9095b261ec400670fb25b5e2d73a6df28ea2dd03i0 |
//        | 333333.btc            | 39d83851f359ef121a10cc13513e81b138535845231b25b3cf35addefec80ebbi0 |
//        | 444444.btc            | 8711d4ee25978be84e8d00fc3534cd4787d7dcf57bb132fed65487023fcc55bbi0 |
//        | 555555.btc            | 5582548464e0f1a0a47f05fcfddb214804b7b258933dcfbbdabb099b73b42feei0 |
//        | wallet.btc            | 08270c4ba2647db4be5c705e1aebf2fde8d2f1777cf3f3ee8c2b12a3f159d15bi0 |
//        | 6324.btc              | 0a827c497b74d624b7aae74a464b4f87cb3c42f6591d3c441a34965a2ec9091bi0 |
//        | 0003.btc              | 00bce8889bcb170f67434f9e97a19a984b359b8ccc7bf62cc73345e3b4a9180fi0 |
//        | crypto.btc            | db0ed5a0b5501b1e62ebfb345e70732e47ed118903c0b196e3cb299caa8f89ffi0 |
//        | aryjr.btc             | 282a78cf88b1c00c5f57b233d9d9d8ed97175b38a2d39804df9379b91fb55d40i0 |
//        | gold.btc              | 1bc4b150a416c794a63698abf54d510c59aa43f1ac59217812a1f69310b0cd00i0 |
//        | 98648.btc             | 4dfe58120a733c3b3712508cdd96f6708e491a0c79c4ff7d85628745eff86cd2i0 |
//        | mastercard.btc        | b73ac971d3b1886859d5eee84e99772845362ede8c153976965aadcd71e33d1ci0 |
//        | morganstanley.btc     | 2177181c3e02d68c33c4d0e72182d6a54ba82e608a3359c1c9c2d36c9e481118i0 |
//        | toyota.btc            | f435b34793e382e58444b09e78456a6c112b4b8da4805b94b0a42747bb60c685i0 |
//        | barclays.btc          | af1f5ecc76ea93275560c292c64dbd0bea191517c4e52f493518ef75b41a340bi0 |
//        | tesla.btc             | 8d415b449c2e2052a50125e8d097e092516f9f8cdc2b91f037a795dec136d353i0 |
//        | lenovo.btc            | 901dbc3745ad6d4fb46baf2a4046cbc6847f91c4e4b8933530f22baac87d949ai0 |
//        | hilton.btc            | d748582e6da4a96c503572aaaf1c9636f73f7cdd148e08b01433908a7062ff0ai0 |
//        | siemens.btc           |                                                                    |
//        | cocacola.btc          |                                                                    |
//        | heyingying.btc        | d4cd7fe8309d2d42a63335261562e64ef310af488a4bf9e349d9a2c119444d58i0 |
//        | 777777.btc            |                                                                    |
//        | barackobama.btc       |                                                                    |
//        | marvel.btc            |                                                                    |
//        | burberry.btc          | 047b5744161aa015f5e9b5138b877adbd41f52f3b46936eccc0815a341053582i0 |
//        | pepsi.btc             |                                                                    |
//        +-----------------------+--------------------------------------------------------------------+
