## PretendBDDとは？

PretendBDDはJUnitのテストクラスでBDDのようにケースを書くためのJavaライブラリです。
具体的には**@Bdd**アノテーションにケースの説明を書くことでBDDっぽい記述を可能にします。

## 使い方
* jarファイルをクラスパスに通します。
* テストクラスに`@RunWith(BddRunner.class)`を追加します
* テストメソッドに`@Bdd`を追加します

```java
    @RunWith(BddRunner.class)
    public void MyTest {

      @Test
      @Bdd("テストケースの説明をここに書く")
      public void test1() {
        ・・・
      }
    }
```
