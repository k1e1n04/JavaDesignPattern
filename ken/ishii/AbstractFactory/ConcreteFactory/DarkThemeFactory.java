package ken.ishii.AbstractFactory.ConcreteFactory;

import ken.ishii.AbstractFactory.AbstractFactory.UIThemeFactory;
import ken.ishii.AbstractFactory.AbstractProduct.Button;
import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;
import ken.ishii.AbstractFactory.AbstractProduct.Label;
import ken.ishii.AbstractFactory.ConcreteProduct.DarkThemeButton;
import ken.ishii.AbstractFactory.ConcreteProduct.DarkThemeCheckbox;
import ken.ishii.AbstractFactory.ConcreteProduct.DarkThemeLabel;

public class DarkThemeFactory implements UIThemeFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }

    public Checkbox createCheckbox() {
        return new DarkThemeCheckbox();
    }

    public Label createLabel() {
        return new DarkThemeLabel();
    }
}
