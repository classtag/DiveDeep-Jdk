package me.anduo.dive.deep.jdk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***
 * Just to mark a package, it must use for package-info.class
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@interface PkgAnnotation {
}
