package com.personal;

/**
 * Created by mac on 09/07/2017.
 * spring skin factory : specific factory
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SummerTextField();
    }

    @Override
    public Combobox createCombobox() {
        return new SummerCombobx();
    }
}
