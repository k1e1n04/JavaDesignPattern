package ken.ishii.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay cd = new CharDisplay('T');
        AbstractDisplay sd = new StringDisplay("Design Pattern");
        AbstractDisplay sd2 = new StringDisplay("Template Method");

        cd.display();
        sd.display();
        sd2.display();  
}
}
