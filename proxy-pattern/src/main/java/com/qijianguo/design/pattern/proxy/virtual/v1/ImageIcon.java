package com.qijianguo.design.pattern.proxy.virtual.v1;

import java.awt.*;

public class ImageIcon implements Icon {

    private String imageURL;
    private String description;

    public ImageIcon(String imageURL, String description) {
        this.imageURL = imageURL;
        this.description = description;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void painIcon(final Component c, Graphics s, int x, int y) {

    }
}
