package ken.ishii.Prototype.Prototype;

public class UnderLinePen implements Product {
    private char ulChar;

    public UnderLinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String string) {
        int length = string.getBytes().length;
        System.out.println(string);
        System.out.print("");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        // Product インターフェースが実装されていない場合発報する
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
