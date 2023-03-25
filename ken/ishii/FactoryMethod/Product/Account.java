package ken.ishii.FactoryMethod.Product;

public class Account extends Product {
    private String owner;

    public Account(String owner) {
        System.out.println("Create account: " + owner);
        this.owner = owner;
    }

    public void use() {
        System.out.println("Use account: " + owner);
    }
    public String getOwner() {
        return owner;
    }
}
