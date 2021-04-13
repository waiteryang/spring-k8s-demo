package com.yangli.design_pattern.javaagent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class TestTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        //进行对应类字节码的操作，并返回新字节码数据的byte数组，如果返回null，则代码不对此字节码作任何操作
        return new byte[0];
    }
}
