package com.designpattern.demo.classloader;

import java.io.*;

public class ClassReloader extends ClassLoader{
    private  String classPath;


    public ClassReloader(String classPath) {
        this.classPath = classPath;
    }
    @Override
    protected  Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = getData(name);
        if (classData!=null){
            return  defineClass(name,classData,0,classData.length);
        }
        else {
            throw new ClassNotFoundException();
        }
    }

    private byte[] getData(String className) {
        String path = classPath+ File.separatorChar+className.replace('.',File.separatorChar)+".class";
        try {
            InputStream is = new FileInputStream(path);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int num =0;
            while ((num=is.read(buffer))!=-1){
                stream.write(buffer,0,num);
            }
            return stream.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

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
