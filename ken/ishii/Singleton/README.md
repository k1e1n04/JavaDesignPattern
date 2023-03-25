# Singleton
## 概要
生成するインスタンスの数を一つに制限するパターン
クラス間で共通のメソッド・プロパティにアクセスしたい場合に使われることが多い

## クラス図
![Singletonクラス図](./images/Singleton.svg)

## 実装例
マルチスレッド環境に対応するために現在は以下の書き方が推奨されている
```Java
class Singleton {
    private Singleton(){}

    public static Singleton getInstace() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
```
### 上記の実装がマルチスレッドに対応できる理由
1. コンストラクタがprivateに設定されているため、外部からのインスタンス化を防ぐことがでる。

2. getInstace()メソッドは静的メソッドであり、SingletonHolderクラスのインスタンスを返すためのメソッド。

3. SingletonHolderクラスは、Singletonクラス内にstaticで定義されたprivateクラスであり、SingletonHolderクラスのインスタンスはgetInstance()メソッドが呼び出されるまでロードされない。

4. SingletonHolderクラスのINSTANCE変数はfinalとして宣言されており、一度生成されたら変更することができません。

5. SingletonHolderクラスは、getInstance()メソッドが呼び出されるまでロードされないため、複数のスレッドがgetInstance()メソッドを同時に呼び出しても、唯一のSingletonインスタンスが生成され、問題が発生しない。

## メリット
- インスタンスの唯一性が保証される
Singletonパターンを使用することで、アプリケーション内に唯一のインスタンスを持つようにすることができる。これにより、不要なインスタンス生成を避け、アプリケーションのメモリ使用量を減らすことができる。

- グローバルアクセスが可能になる
Singletonパターンを使用することで、アプリケーション内のどの場所からでも、唯一のインスタンスにアクセスすることができる。これにより、アプリケーション内で共通の状態を保持することができ、コードの重複を避けることができる。

- インスタンス生成のタイミングを制御できる
Singletonパターンを使用することで、インスタンスの生成タイミングを制御することができる。具体的には、インスタンスの生成時に必要なリソースが大量に必要な場合に、アプリケーションの起動時ではなく必要な時にインスタンスを生成することができる。

- 継承による拡張が容易になる
Singletonパターンを使用することで、サブクラスによる拡張が容易になる。つまり、新しいクラスを追加する場合には、既存のSingletonクラスを継承することで、既存のコードに影響を与えることなく、新しいクラスを利用することができる。