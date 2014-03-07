package jp.gr.java_conf.kazsharp.pretendbdd;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * PretendBDDの機能を使うためのアノテーション.
 *
 * @author Kazushige Sasaki
 * @since 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bdd {
	String value();
}
