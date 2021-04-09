package com.desing.patterns.structural.proxy.image;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by AnDrEy on 3/2/2021.
 */
public class ImageProxy implements Icon {
    ImageIcon _imageIcon;
    URL _imageURL;
    Thread _retrievalThread;
    boolean _retrieving = false;

    public ImageProxy(URL url) {
        _imageURL = url;
    }

    public int getIconWidth() {
        if (_imageIcon != null) {
            return _imageIcon.getIconWidth();
        } else {
            return 400;
        }
    }

    public int getIconHeight() {
        if (_imageIcon != null) {
            return _imageIcon.getIconHeight();
        } else {
            return 400;
        }
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (_imageIcon != null) {
            _imageIcon.paintIcon(c, g, x, y);
        } else {
            g.setColor(Color.WHITE);
            g.drawString("Loading CD cover, please wait...", x + 100, y + 190);
            if (!_retrieving) {
                _retrieving = true;
                _retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            _imageIcon = new ImageIcon(_imageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                _retrievalThread.start();
            }
        }
    }
}
