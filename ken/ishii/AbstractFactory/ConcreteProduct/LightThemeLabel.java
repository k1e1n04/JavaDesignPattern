package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Label;

public class LightThemeLabel implements Label {
    public void render() {
        System.out.println("Rendering light theme label");
    }
}
