package com.ang.chapter10;


import javax.swing.*;
import java.awt.*;

/**
 * @author: 于昂
 * @date: 2023/3/8
 **/
public class ImageTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageFrame();
            frame.setTitle("ImageTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class ImageFrame extends JFrame {
    public ImageFrame() throws HeadlessException {
        add(new ImageComponent());
        pack();
    }
}

class ImageComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    private final Image image;

    public ImageComponent() {
        this.image = new ImageIcon("src/main/resources/img/IMG_1412.JPG").getImage();
    }

    @Override
    public void paintComponents(Graphics g) {
        if (image == null) return;
        int width = image.getWidth(this);
        int height = image.getHeight(this);

        g.drawImage(image, 0, 0, null);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
