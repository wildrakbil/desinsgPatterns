package com.desing.patterns.abstarcfFactory.factories;

import com.desing.patterns.abstarcfFactory.component.botton.IButton;
import com.desing.patterns.abstarcfFactory.component.botton.MacOSButton;
import com.desing.patterns.abstarcfFactory.component.checkbox.ICheckbox;
import com.desing.patterns.abstarcfFactory.component.checkbox.MacOSCheckbox;
import com.desing.patterns.abstarcfFactory.component.label.ILabel;
import com.desing.patterns.abstarcfFactory.component.label.MacOSLabel;
import com.desing.patterns.abstarcfFactory.component.toolbar.IToolbar;
import com.desing.patterns.abstarcfFactory.component.toolbar.MacOSToolbar;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class MacOSFactory implements IGUIFactory{


    public IButton createButton() {
        return new MacOSButton();
    }


    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }


    public IToolbar createToolbar() {
        return new MacOSToolbar();
    }


    public ILabel createLabel() {
        return new MacOSLabel();
    }
}
