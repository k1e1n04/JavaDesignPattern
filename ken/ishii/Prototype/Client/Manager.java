package ken.ishii.Prototype.Client;

import java.util.HashMap;

import ken.ishii.Prototype.Prototype.Product;

public class Manager {
    private HashMap<String,Product> showcase = new HashMap<>();
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
