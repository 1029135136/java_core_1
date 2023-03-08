package com.ang.chapter10;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 于昂
 * @date: 2023/3/8
 **/
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            NotHelloWorldFrame frame = new NotHelloWorldFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() throws HeadlessException {
        add(new NotHel1oWorldComponent());
        pack();
    }
}
class NotHel1oWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
