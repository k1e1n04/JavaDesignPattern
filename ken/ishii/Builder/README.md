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
### メリット
- 読みやすいコードを作成できる
Builderパターンを使うことで、コンストラクタのパラメータが増えても、可読性の高いコードを作成することができる。Builderパターンでは、メソッドを使ってオブジェクトを構築するため、どのパラメータが設定されているかが明確になる。
- 不変性を保証できる
Builderパターンを使うことで、オブジェクトの不変性を保証することができる。Builderパターンでは、オブジェクトを作成するためのBuilderクラスが存在し、そのクラスで作成されたオブジェクトは不変性を保証される。
- 柔軟性が高い
Builderパターンを使うことで、オブジェクトの作成過程を柔軟に変更することができる。例えば、オブジェクトの作成過程にある手順をスキップすることができたり、手順を追加することができたりする。また、Builderクラスを継承することで、既存のオブジェクトの作成過程を変更することもできる。
- パラメータが多いコンストラクタを回避できる
Builderパターンを使うことで、多数のパラメータを持つコンストラクタを回避できる。パラメータが多いコンストラクタを使う場合、どのパラメータがどのような値を持つのかを覚えておく必要があり、間違いが起きやすい。Builderパターンでは、オブジェクトを構築するためのメソッドを呼び出すだけで、必要なパラメータを指定することができる。



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

