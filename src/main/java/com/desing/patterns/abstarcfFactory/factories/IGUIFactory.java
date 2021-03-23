package com.desing.patterns.abstarcfFactory.factories;

import com.desing.patterns.abstarcfFactory.component.botton.IButton;
import com.desing.patterns.abstarcfFactory.component.checkbox.ICheckbox;
import com.desing.patterns.abstarcfFactory.component.label.ILabel;
import com.desing.patterns.abstarcfFactory.component.toolbar.IToolbar;

/**
 * Created by AnDrEy on 3/23/2021.
 */
public interface IGUIFactory {

    IButton createButton();

    ICheckbox createCheckbox();

    IToolbar createToolbar();

    ILabel createLabel();
}
