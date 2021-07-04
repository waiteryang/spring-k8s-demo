package com.yangli.design_pattern.test;

import org.springframework.boot.ApplicationRunner;

public class Test {

    public static void main(String[] args) {

        //        String s = "abaccdeff";
        //        String res = null;
        //        HashMap<String, Object> map = new HashMap<>(s.length());
        //        for (int i = 0; i <= s.length(); i++) {
        //            char ch = s.charAt(i);
        //            String k = Objects.toString(ch);
        //            if (i >= 1 && map.containsKey(k)) {
        //                res = k;
        //                break;
        //            }
        //            map.put(k, 1);
        //        }
        //        System.out.println(res);
        Staff staff = new Staff();
        Staff staff1 = new Staff();
        System.out.println(staff.hashCode());
        System.out.println(staff1.hashCode());

        Class clazz = staff.getClass();
        Class clazz1 = staff1.getClass();
        System.out.println(clazz.getClassLoader().getParent());
        System.out.println(clazz1.hashCode());
    }
}
