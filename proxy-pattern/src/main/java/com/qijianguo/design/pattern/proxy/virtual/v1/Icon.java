package com.qijianguo.design.pattern.proxy.virtual.v1;

import java.awt.*;

public interface Icon {

    int getWidth();

    int getHeight();

    /**
     * 绘制图像
     * @param c
     * @param s
     * @param x
     * @param y
     */
    void painIcon(final Component c, Graphics s, int x, int y);

}
