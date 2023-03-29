package ken.ishii.AbstractFactory;

import ken.ishii.AbstractFactory.AbstractFactory.UIThemeFactory;
import ken.ishii.AbstractFactory.Client.Client;
import ken.ishii.AbstractFactory.ConcreteFactory.DarkThemeFactory;
import ken.ishii.AbstractFactory.ConcreteFactory.LightThemeFactory;

public class Main {
    public static void main(String[] args) {
        // Light theme
        UIThemeFactory ligThemeFactory = new LightThemeFactory();
        Client lightClient = new Client(ligThemeFactory);
        lightClient.renderUI();

        // Dark theme
        UIThemeFactory darkFactory = new DarkThemeFactory();
        Client darClient = new Client(darkFactory);
        darClient.renderUI();
    }
}
