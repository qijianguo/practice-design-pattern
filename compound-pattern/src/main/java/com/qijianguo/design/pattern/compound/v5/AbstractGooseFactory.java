package com.qijianguo.design.pattern.compound.v5;

public abstract class AbstractGooseFactory {

    abstract Goose createInnerGoose();

    abstract Goose createOuterGoose();
}
