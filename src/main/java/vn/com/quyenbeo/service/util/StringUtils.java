package vn.com.quyenbeo.service.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class StringUtils {
    private static final char HEXDIGITS[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String toMD5(String stringInput) {
        byte[] source;
        try {
            source = stringInput.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            source = stringInput.getBytes();
        }
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(source);
            byte temp[] = md.digest();
            char str[] = new char[16 * 2];
            int k = 0;
            for (int i = 0; i < 16; i++) {
                byte byte0 = temp[i];
                str[k++] = HEXDIGITS[byte0 >>> 4 & 0xf];
                str[k++] = HEXDIGITS[byte0 & 0xf];
            }
            result = new String(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean isValidTextCondition(final String text) {
        return text != null && !text.trim().isEmpty();
    }
}
