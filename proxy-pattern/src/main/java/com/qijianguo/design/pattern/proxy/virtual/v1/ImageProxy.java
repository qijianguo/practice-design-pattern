package com.qijianguo.design.pattern.proxy.virtual.v1;

import java.awt.*;

/**
 *
 * @author qijianguo
 */
public class ImageProxy implements Icon {

    /**
     * 加载成功后真正显示的对象
     */
    private ImageIcon imageIcon;

    private String imageURL;

    private boolean retrieving = false;

    public ImageProxy(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getWidth() {
        if (imageIcon != null) {
            return imageIcon.getWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getHeight() {
        if (imageIcon != null) {
            return imageIcon.getHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void painIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.painIcon(c, g, x, y);
            return;
        }

        // 加载图片前默认显示
        g.drawString("Loading CD cover, please wait...", x, y);
        if (!retrieving) {
            // 异步请求图片资源
            new Thread(() -> {
                imageIcon = new ImageIcon(imageURL, "CD Cover");
                c.repaint();
            }).start();
        }
    }
}
