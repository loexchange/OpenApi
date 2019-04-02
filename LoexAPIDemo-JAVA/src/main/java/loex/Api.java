package loex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author liuxi
 * @since 2019-01-15
 */
public class Api {

    public static void main(String[] args)
        throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String apiKey = "";
        String secret = "";
        String url = "https://openapi.loex.io/{请求地址}";

        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("api_key", apiKey);
        params.put("time", System.currentTimeMillis()/1000);


        String[] keys = new String[params.keySet().size()];
        params.keySet().toArray(keys);
        Arrays.sort(keys);

        StringBuilder p = new StringBuilder();
        for (String key : keys) {
            p.append(key).append(params.get(key));
        }
        p.append(secret);
        System.out.println(p.toString());
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest(p.toString().getBytes("utf-8"));
        String sign = bytesToHex(bytes);
        params.put("sign", sign);

        System.out.println(params);
        String result = HttpUtil.get(url, params);
        System.out.println(result);
    }

    private static String bytesToHex(byte[] md5Array) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < md5Array.length; i++) {
            int temp = 0xff & md5Array[i];//TODO:此处为什么添加 0xff & ？
            String hexString = Integer.toHexString(temp);
            if (hexString.length() == 1) {//如果是十六进制的0f，默认只显示f，此时要补上0
                strBuilder.append("0").append(hexString);
            } else {
                strBuilder.append(hexString);
            }
        }
        return strBuilder.toString();
    }
}
