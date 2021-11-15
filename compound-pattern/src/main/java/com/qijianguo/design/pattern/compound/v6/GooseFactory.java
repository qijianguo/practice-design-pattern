package com.qijianguo.design.pattern.compound.v6;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    Goose createInnerGoose() {
        return new InnerGoose();
    }

    @Override
    Goose createOuterGoose() {
        return new OuterGoose();
    }
}
