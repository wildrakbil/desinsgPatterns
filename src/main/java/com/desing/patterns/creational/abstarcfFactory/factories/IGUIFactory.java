package com.desing.patterns.creational.abstarcfFactory.factories;

import com.desing.patterns.creational.abstarcfFactory.component.checkbox.ICheckbox;
import com.desing.patterns.creational.abstarcfFactory.component.botton.IButton;
import com.desing.patterns.creational.abstarcfFactory.component.label.ILabel;
import com.desing.patterns.creational.abstarcfFactory.component.toolbar.IToolbar;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public interface IGUIFactory {

    IButton createButton();

    ICheckbox createCheckbox();

    IToolbar createToolbar();

    ILabel createLabel();
}
