package com.qijianguo.design.pattern.compound.v5;

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
