package ken.ishii.Builder;

import java.lang.NullPointerException;

public class People {
    String name;
    String sex;
    int age;
    
    public static class Builder {
        String name;
        String sex;
        int age;
    
        public Builder(String name, String sex) {
        if (name == null || sex == null) throw new NullPointerException();
            this.name = name;
            this.sex = sex;
        }
    
        public Builder age(int age) {
        this.age = age;
        return this;
        }
    
        public People build() {
            if (name == null || sex == null) throw new NullPointerException();
            return new People(this);
        }
    }

    private People(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }
}
