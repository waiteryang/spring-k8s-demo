package com.designpattern.demo.classloader;

import java.net.URL;
import java.net.URLClassLoader;


public class AppClassLoader extends URLClassLoader {

    private String packageName = "your.name.classPackage";

    public AppClassLoader(URL[] classPath, ClassLoader parent) {
        super(classPath,parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> aClass = findLoadedClass(name);
        if (aClass!=null){
            return aClass;
        }
        if (packageName.startsWith(name)){
            return super.loadClass(name);
        }else {
            return findClass(name);
        }
    }

}
