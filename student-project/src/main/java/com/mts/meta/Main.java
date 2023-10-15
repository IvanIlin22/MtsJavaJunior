package com.mts.meta;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String inputStr = args[0];
        String hash = DigestUtils.md5Hex(inputStr);
        System.out.println(hash);
    }
}
