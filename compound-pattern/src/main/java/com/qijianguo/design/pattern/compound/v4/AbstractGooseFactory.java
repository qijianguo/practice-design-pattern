package com.qijianguo.design.pattern.compound.v4;

public abstract class AbstractGooseFactory {

    abstract Goose createInnerGoose();

    abstract Goose createOuterGoose();
}
