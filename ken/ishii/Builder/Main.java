package ken.ishii.Builder;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        People people = new People.Builder("Tom", "male").age(23).build();
        System.out.println(people);
    }
}
