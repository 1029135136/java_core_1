package com.ang.chapter6_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author: 于昂
 * @date: 2023/3/8
 **/
public class TimerTest {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();

        Timer t = new Timer(1000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.printf("At the tone, the time is %s%n", new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
