# Builder
## 概要
コンストラクタに対して数多くのパラメータをセットする必要がある時に、代わりに使うことが推奨されているパターン。
ただしこれが推奨されるのは、コンストラクタに設定されるパラメータの内必須のものが少数である時に限られる。

## 2種類の Builder パターン
1. Effective Java
2. GoF

## Builder なし
```Java
class People {
  String name;
  String sex;
  int age;

  People(String name, String sex, int age) {
    if (name == null || sex == null) throw new NullPointerException();

    this.name = name;
    this.sex = sex;
    this.age = age;
  }
}
```
- コンストラクタの引数の順番を間違える可能性がある
- Optional の値に適当な値を渡す必要がある

## Effective Java
```Java
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
```
クライアントコード
```Java
People person = new People.Builder("Test", "male").build();
```
- Optional の age に渡す値を明確にできている
- 必須フィールドのみに値を設定することもできる
- 後述の GoF より記述量が少ない

## GoF
```Java
class People {
    private String name;
    private Integer age;
    private String hobby;

    // getter,setter...
    String hello() {
        //...
    }
}

class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    void construct() {
        builder.name("Tom");
        builder.age(12);
        builder.hobby("BaseBall");
    }
}

interface Builder {
    void name(String name);
    void age(Integer age);
    void hobby(String hobby);

    People getResult();
}

class PeopleBuilder implements Builder {
    private People people;

    PeopleBuilder() {
        this.people = new People();
    }

    @Override
    public void name(String name) {
        people.setName(name);
    }
    @Override
    public void age(Integer age) {
        people.setAge(age);
    }
    @Override
    public void hobby(String hobby) {
        people.setHobby(hobby);
    }
    @Override
    public People getResult() {
        if (people.getName() == null || people.getAge() == null) {
            throw new NullPointerException();
        }
        return this.people;
    }
}

// Builder builder = new PeopleBuilder();
// Director director = new Director(builder);
// director.construct();
// builder.getResult().hello();
```
- interfaceや実装など、記述量が多くなる。
- 生成処理が複雑。