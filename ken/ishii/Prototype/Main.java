package ken.ishii.Prototype;

import ken.ishii.Prototype.Client.Manager;
import ken.ishii.Prototype.Prototype.MessageBox;
import ken.ishii.Prototype.Prototype.Product;
import ken.ishii.Prototype.Prototype.UnderLinePen;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        UnderLinePen upen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('@');
        MessageBox sbox = new MessageBox('♪');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Git Hub");
        Product p2 = manager.create("warning box");
        p2.use("Qiita");
        Product p3 = manager.create("slash box");
        p3.use("Java");
}
}
