package com.desing.patterns.abstarcfFactory;

import com.desing.patterns.abstarcfFactory.component.botton.IButton;
import com.desing.patterns.abstarcfFactory.component.checkbox.ICheckbox;
import com.desing.patterns.abstarcfFactory.component.label.ILabel;
import com.desing.patterns.abstarcfFactory.component.toolbar.IToolbar;
import com.desing.patterns.abstarcfFactory.factories.IGUIFactory;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class Application {
    private IButton iButton;
    private ICheckbox iCheckbox;
    private IToolbar iToolbar;
    private ILabel iLabel;

    public Application(IGUIFactory factory) {
        iButton = factory.createButton();
        iCheckbox = factory.createCheckbox();
        iToolbar = factory.createToolbar();
        iLabel = factory.createLabel();
    }

    public void paint() {
        iButton.paint();
        iCheckbox.paint();
        iToolbar.paint();
        iLabel.paint();
    }
}
