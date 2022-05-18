package com.yemensoft.onyx.classes;

import android.util.Base64;
import java.security.SignatureException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionData {
    private static final String SHA1_ALGORITHM = "HmacSHA1";
    public static final String PASSWORD_KEY = "FCUyZ3PcYJGJFVuAguHcV3mTbYg=";
    /**
     * Computes RFC 2104-compliant HMAC signature.
     * * @param data
     * The data to be signed.
     *
     * @param data The signing key.
     * @return The Base64-encoded RFC 2104-compliant HMAC signature.
     * @throws SignatureException when signature generation fails
     */

    public static String calculateRFC2104HMAC(String data) {
        String result = null;
        try {

            SecretKeySpec signingKey = new SecretKeySpec(PASSWORD_KEY.getBytes(), SHA1_ALGORITHM);

            Mac mac = Mac.getInstance(SHA1_ALGORITHM);
            mac.init(signingKey);

            byte[] rawHmac = mac.doFinal(data.getBytes());
            result = new String(Base64.encodeToString(rawHmac, Base64.DEFAULT));
        } catch (Exception e) {
            //logger.error(e);
            e.printStackTrace();
        }
        return result;
    }
}
