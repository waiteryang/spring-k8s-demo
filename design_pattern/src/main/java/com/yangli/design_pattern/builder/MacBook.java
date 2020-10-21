package com.yangli.design_pattern.builder;

import javax.crypto.Mac;

public class MacBook extends Computer {

    protected MacBook(){

    }

    @Override
    public void setOs() {
        mOs = "Mac OS 1.1.1";
    }
}
