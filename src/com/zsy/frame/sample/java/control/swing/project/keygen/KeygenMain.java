package com.zsy.frame.sample.java.control.swing.project.keygen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2015/8/13.
 */
public class KeygenMain {
    private JPanel root;
    private JTextField input_name_tf;
    private JButton generate_jbtn;
    private JLabel username_tips_jlb;
    private JTextArea show_key_jta;

    public static void main(String[] args) {
//        initSkin();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
//                启动界面
                JFrame frame = new JFrame("Keygen For Idea Version 14");
                frame.setContentPane(new KeygenMain().root);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500,500);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

     /**
      * 设置外观使用UIManager类的setLookAndFeel()方法  。
      getCrossPaltformLookAndFeelClassName()  ;//直接获取跨平台外观   返回的 是 外观类名字
      getSystemLookAndFeelClassName();//获得系统的外观类名字
      我们在设置完外观之后一定要调用 SwingUtilities.updateComponentTreeUI(mw);  方法 来更新容器   ,
      否则窗体不会i正常显示 ,参数是最外层框架的对象实例
      */
    private static void initSkin(){
        //         获取系统所有外观 。  每个外观都对应一个类名字
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KeygenMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(KeygenMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(KeygenMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(KeygenMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    public KeygenMain() {
        generate_jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = input_name_tf.getText().trim();
                if ((userName.equals("")) || (userName == null)) {
                    show_key_jta.setText("Input Error");
                } else {
                    Random r = new Random();
                    String key = Keygen.MakeKey(userName, 0, r.nextInt(2147483647));
                    show_key_jta.setText(key);
                }
            }
        });
    }
}
