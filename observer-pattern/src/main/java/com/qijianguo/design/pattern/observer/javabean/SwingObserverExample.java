package com.qijianguo.design.pattern.observer.javabean;

import javax.swing.*;

/**
 * @author qijianguo
 */
public class SwingObserverExample {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Should i do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(jButton);
        // 设置其他属性


    }
}
