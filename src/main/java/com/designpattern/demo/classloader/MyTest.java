package com.designpattern.demo.classloader;

public class MyTest {

    public static void main(String[] args)  {
        try {
            String path = "E:\\workspace\\jwt_demo\\target\\classes";
            ClassReloader reloader = new ClassReloader(path);
            String classname = "com.hxuhao.model.User";
            Class r = reloader.findClass(classname);
            System.out.println(r.newInstance());
            ClassReloader reloader1 = new ClassReloader(path);
            Class r1 = reloader1.findClass(classname);
            System.out.println(r1.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
