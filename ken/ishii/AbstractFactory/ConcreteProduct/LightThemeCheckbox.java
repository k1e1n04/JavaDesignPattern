package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;

public class LightThemeCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering light theme checkbox");
    }
}
