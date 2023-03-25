# Factory Method
## 概要
インスタンスの作り方をスーパークラスで定め、具体的な処理をサブクラスで行うパターン
Factory パターンの方が使用頻度は高い

## クラス図
![FactoryMethodクラス図](./images/FactoryMethod.svg)

## 具体例
抽象クラス
- Product :Productクラス
- Creator :Factoryクラス

具象クラス
- ConcreteCreator :AccountFactoryクラス
- ConcreteProduct :Accountクラス