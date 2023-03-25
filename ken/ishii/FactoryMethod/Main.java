package ken.ishii.FactoryMethod;

import ken.ishii.FactoryMethod.Factory.AccountFactory;
import ken.ishii.FactoryMethod.Factory.Factory;
import ken.ishii.FactoryMethod.Product.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory  = new AccountFactory();
        Product account1 = factory.create("Ralph Johnson");
        Product account2 = factory.create("Richard Helm");
        Product account3 = factory.create("John Vlissides");
        Product account4 = factory.create("Erich Gamma");

        account1.use();
        account2.use();
        account3.use();
        account4.use();
        AccountFactory accountFactory = (AccountFactory)factory;
        System.out.println(accountFactory.getOwners());   
}
}
