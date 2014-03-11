## PretendBDDとは？

PretendBDDの意味は「なんちゃってBDD」です。
JUnitのテストクラスでBDDのようにケースを書くためのJavaライブラリですが、
具体的には**@Bdd**アノテーションにケースの説明を書くことで
メソッド名を動的に変更するだけです。

## インストール
### Mavenの場合
以下のdependencyを追加してください。
```
<dependency>
	<groupId>jp.gr.java_conf.kazsharp</groupId>
	<artifactId>pretendbdd</artifactId>
	<version>1.0</version>
</dependency>

```

### Maven以外の場合
pretendbdd-x.x.jarとjunitのjarファイルをクラスパスに通してください。


## 使い方
* テストクラスに`@RunWith(BddRunner.class)`を追加します
* テストメソッドに`@Bdd`を追加します
* 「bddconf.properties」というファイルを作成し、「bdd=true」というプロパティを記述します。
* クラスパスの通る場所に「bddconf.properties」を配置します。

### コードサンプル
```java
    @RunWith(BddRunner.class)
    public void MyTest {

      @Test
      @Bdd("テストケースの説明をここに書く")
      public void test1() {
        //Write JUnit test code here.
      }
    }
```

## LICENSE
This software is released under the MIT License, see LICENSE.txt.
