package com.qijianguo.design.pattern.compound.v6;

public abstract class AbstractGooseFactory {

    abstract Goose createInnerGoose();

    abstract Goose createOuterGoose();
}
