package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Label;

public class DarkThemeLabel implements Label {
    public void render() {
        System.out.println("Rendering dark theme label");
    }
}
