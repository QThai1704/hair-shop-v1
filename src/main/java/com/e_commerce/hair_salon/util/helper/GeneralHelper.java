package com.e_commerce.hair_salon.util.helper;

import com.e_commerce.hair_salon.util.constant.Constants;
import com.nimbusds.jose.util.Base64;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class GeneralHelper {

    public static SecretKey getSecretKey(String base64Secret) {
        byte[] keyBytes = Base64.from(base64Secret).decode();
        System.out.println("base64Secret: " + base64Secret);
        return new SecretKeySpec(keyBytes, 0, keyBytes.length, Constants.JWT_ALGORITHM.getName());
    }
}
