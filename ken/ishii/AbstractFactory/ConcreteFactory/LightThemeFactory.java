package ken.ishii.AbstractFactory.ConcreteFactory;

import ken.ishii.AbstractFactory.AbstractFactory.UIThemeFactory;
import ken.ishii.AbstractFactory.AbstractProduct.Button;
import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;
import ken.ishii.AbstractFactory.AbstractProduct.Label;
import ken.ishii.AbstractFactory.ConcreteProduct.LightThemeButton;
import ken.ishii.AbstractFactory.ConcreteProduct.LightThemeCheckbox;
import ken.ishii.AbstractFactory.ConcreteProduct.LightThemeLabel;

public class LightThemeFactory implements UIThemeFactory{
    public Button createButton() {
        return new LightThemeButton();
    }

    public Checkbox createCheckbox() {
        return new LightThemeCheckbox();
    }

    public Label createLabel() {
        return new LightThemeLabel();
    }
}
