package com.yangli.design_pattern.test;

import java.util.HashMap;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        String s = "abaccdeff";
        String res = null;
        HashMap<String, Object> map = new HashMap<>(s.length());
        for (int i = 0; i <= s.length(); i++) {
            char ch = s.charAt(i);
            String k = Objects.toString(ch);
            if (i >= 1 && map.containsKey(k)) {
                res = k;
                break;
            }
            map.put(k, 1);
        }
        System.out.println(res);
    }
}
