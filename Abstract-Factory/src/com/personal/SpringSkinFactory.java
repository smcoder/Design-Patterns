package com.personal;

/**
 * Created by mac on 09/07/2017.
 * Spring skin Factory: specific factory
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SpringTextField();
    }

    @Override
    public Combobox createCombobox() {
        return new SpringCombobox();
    }
}
