package com.desing.patterns.structural.proxy.image;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by AnDrEy on 3/2/2021.
 */
public class ImageProxyTestDrive extends JFrame {

    private URL _initialURL = new URL("https://img.discogs.com/YEtDRg0P9s6izh2RXGIeYPwxXis=/fit-in/300x300/filters:strip_icc():format(jpeg):mode_rgb():quality(40)/discogs-images/R-6346047-1444305951-8622.jpeg.jpg");
    private ImageComponent _imageComponent;

    public ImageProxyTestDrive() throws Exception {
        setSize(500, 500);
        setResizable(false);
        Icon icon = new ImageProxy(_initialURL);
        _imageComponent = new ImageComponent(icon);
        getContentPane().add(_imageComponent);
        setTitle("Proxy Design Pattern");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
