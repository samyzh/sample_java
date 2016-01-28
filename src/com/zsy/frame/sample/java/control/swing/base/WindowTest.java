package com.zsy.frame.sample.java.control.swing.base;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Administrator on 2015/8/13.
 */
public class WindowTest {
    private JPanel root;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowTest");
        frame.setContentPane(new WindowTest().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public WindowTest() {
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });
    }
}
