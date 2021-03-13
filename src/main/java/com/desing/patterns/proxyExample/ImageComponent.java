package com.desing.patterns.proxyExample;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AnDrEy on 3/2/2021.
 */
public class ImageComponent extends JPanel  {

    public ImageComponent(Icon icon) {
        setLayout(new BorderLayout());
        JLabel jLabel= new JLabel(icon);
        Color fondo = new Color(21, 22, 25);
        setBackground(fondo);
        add(jLabel, BorderLayout.CENTER);
    }
}
