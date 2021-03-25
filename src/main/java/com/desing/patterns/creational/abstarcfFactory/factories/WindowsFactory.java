package com.desing.patterns.creational.abstarcfFactory.factories;

import com.desing.patterns.creational.abstarcfFactory.component.botton.IButton;
import com.desing.patterns.creational.abstarcfFactory.component.botton.WindowsButton;
import com.desing.patterns.creational.abstarcfFactory.component.checkbox.ICheckbox;
import com.desing.patterns.creational.abstarcfFactory.component.checkbox.WindowsCheckbox;
import com.desing.patterns.creational.abstarcfFactory.component.label.ILabel;
import com.desing.patterns.creational.abstarcfFactory.component.label.WindowsLabel;
import com.desing.patterns.creational.abstarcfFactory.component.toolbar.IToolbar;
import com.desing.patterns.creational.abstarcfFactory.component.toolbar.WindowsToolbar;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public class WindowsFactory implements IGUIFactory {

    public IButton createButton() {
        return new WindowsButton();
    }


    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }


    public IToolbar createToolbar() {
        return new WindowsToolbar();
    }


    public ILabel createLabel() {
        return new WindowsLabel();
    }
}
