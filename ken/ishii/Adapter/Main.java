package ken.ishii.Adapter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import ken.ishii.Adapter.Adapter.FileProperties;
import ken.ishii.Adapter.Target.FileIo;

public class Main {
    public static void main(String[] args) {
        FileIo fileIo = new FileProperties();//※
        try {
            fileIo.readFromFile("./public/file.txt");
            fileIo.setValue("Apple", "iPhone");
            fileIo.setValue("Google", "Android");
            fileIo.setValue("Git", "Hub");
            fileIo.setValue("DesignPattern", "Adapter");
            fileIo.writeToFile("./public/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
