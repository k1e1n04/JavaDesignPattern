package ken.ishii.FactoryMethod.Factory;

import java.util.*;

import ken.ishii.FactoryMethod.Product.Account;
import ken.ishii.FactoryMethod.Product.Product;

public class AccountFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    protected Product createProduct(String owner) {
        return new Account(owner);
    }

    protected void registerProduct(Product product) {
        owners.add( ((Account)product).getOwner() );
    }

    public List<String> getOwners() {
        return owners;
    }
}
