package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;

public class DarkThemeCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering dark theme checkbox");
    }
}
