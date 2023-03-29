package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Button;

public class LightThemeButton implements Button {
    public void render() {
        System.out.println("Rendering light theme button");
    }
}
