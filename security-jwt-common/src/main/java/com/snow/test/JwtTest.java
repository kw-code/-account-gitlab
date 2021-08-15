package com.snow.test;

import com.snow.util.RsaUtils;
import org.junit.Test;

public class JwtTest {
    private String privateKey = "c:/tools/auth_key/id_key_rsa";

    private String publicKey = "c:/tools/auth_key/id_key_rsa.pub";

    @Test
    public void test1() throws Exception{
        RsaUtils.generateKey(publicKey,privateKey,"dpb",1024);
    }

}