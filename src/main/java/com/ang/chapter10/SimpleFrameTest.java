package com.ang.chapter10;

import javax.swing.*;
import java.awt.*;

/**
 * @author: 于昂
 * @date: 2023/3/8
 **/
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setTitle("Hello World");
        });
    }


}

class SimpleFrame extends JFrame {
    public SimpleFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize((int) screenSize.getWidth() / 2, (int) screenSize.getHeight() / 2);
        setLocationByPlatform(true);

        Image image = new ImageIcon("src/main/resources/img/IMG_1412.JPG").getImage();
        setIconImage(image);
    }
}
