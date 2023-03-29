package ken.ishii.AbstractFactory.AbstractFactory;

import ken.ishii.AbstractFactory.AbstractProduct.Button;
import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;
import ken.ishii.AbstractFactory.AbstractProduct.Label;

public interface UIThemeFactory {
    Button createButton();
    Checkbox createCheckbox();
    Label createLabel();
}
