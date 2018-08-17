package cn.xconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Title:排除该字段与DB的关系
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 13:43
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DbExclude {
}
