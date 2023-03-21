# Iterator パターン
## 概要
単語自体は<b>繰り返す、反復する</b>等の意味を持つ。
集約をしたオブジェクトを列挙する手段を提供するデザインパターン。

## 使用ケース
- アプリケーション固有なデータ、構造を持ったオブジェクトにアクセスする場合
- 配列やコレクションなどの集合する要素にアクセスする場合
- 集合の要素に順次にアクセスする必要がある場合

## Iterator パターンのクラス図
![Iteratorクラス図](./images/iterator.svg)

## 具体例
- ConcreteAggregate クラス => BookShelf
- BookShelf クラスは複数の Book クラスを持つ
- ConcreteIterator クラス => BookShelfIterator

## 使用する汎用メソッド
1. next()
    次の要素を返す(現在要素を返し、次の位置に進める)

2. hasNext()
    次の要素が存在するか調べ、真偽値を返す

    