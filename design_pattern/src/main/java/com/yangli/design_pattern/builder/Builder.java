package com.yangli.design_pattern.builder;

/**
 * 抽象Builder
 */
public abstract class Builder {

    abstract void buildBoard(String board);

    abstract void buildDisplay(String display);

    abstract void buildOs();

    abstract Computer build();
}
