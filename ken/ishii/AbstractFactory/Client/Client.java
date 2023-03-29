package ken.ishii.AbstractFactory.Client;

import ken.ishii.AbstractFactory.AbstractFactory.UIThemeFactory;
import ken.ishii.AbstractFactory.AbstractProduct.Button;
import ken.ishii.AbstractFactory.AbstractProduct.Checkbox;
import ken.ishii.AbstractFactory.AbstractProduct.Label;

public class Client {
    private Button button;
    private Checkbox checkbox;
    private Label label;

    public Client(UIThemeFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        label = factory.createLabel();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
        label.render();
    }
}
