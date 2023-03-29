package ken.ishii.AbstractFactory.ConcreteProduct;

import ken.ishii.AbstractFactory.AbstractProduct.Button;

public class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering dark theme button");
    }
}
