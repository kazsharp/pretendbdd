/*
 BddRunner.java

 Copyright (c) 2014 KazushigeSasaki

 This software is released under the MIT License.

 http://opensource.org/licenses/mit-license.php

 */
package jp.gr.java_conf.kazsharp.pretendbdd;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

/**
 * PretendBDDの機能を使うためのRunner.
 * <p>
 * テストクラスのRunnerに指定することで@Bddの値をメソッド名にする.
 * </p>
 * <blockquote>
 *
 * <pre>
 *
 * &#064;RunWith(BddRunner.class)
 * public class MyTest {
 *
 * 	&#064;Test
 *   &#064;Bdd(&quot;テストケースの説明&quot;)
 *   public void test1() {
 *     ・・・
 *   }
 * }
 *
 * </pre>
 *
 * </blockquote>
 *
 * @author Kazushige Sasaki
 * @since 1.0
 *
 */
public class BddRunner extends BlockJUnit4ClassRunner {

	/*
	 * (非 Javadoc)
	 *
	 * @see
	 * org.junit.runners.BlockJUnit4ClassRunner#testName(org.junit.runners.model
	 * .FrameworkMethod)
	 */
	@Override
	protected String testName(FrameworkMethod method) {
		// 引数で与えられたメソッドにBddアノテーションがあればその値をメソッド名として返す。
		Bdd an = method.getAnnotation(Bdd.class);
		if (an != null) {
			return an.value();
		} else {
			return method.getName();
		}
	}

	/**
	 * コンストラクタ.
	 *
	 * @param clazz
	 *            BlockJUnit4ClassRunnerのコンストラクタへ渡すClassオブジェクト.
	 * @throws InitializationError
	 *             テストクラスの初期化に失敗した場合
	 */
	public BddRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}
}
