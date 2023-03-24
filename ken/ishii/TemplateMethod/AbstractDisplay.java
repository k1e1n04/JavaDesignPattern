package ken.ishii.TemplateMethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    //Template Method
    public final void display() {
        open();
        for (int i =0; i < 3; i++) {
            print();
        }
        close();
    }

}
