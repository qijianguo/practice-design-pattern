package com.qijianguo.design.pattern.observer.javabean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author qijianguo
 */
public class DevilListener  implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}
