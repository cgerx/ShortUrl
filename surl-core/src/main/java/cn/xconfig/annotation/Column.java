package cn.xconfig.annotation;

import java.lang.annotation.*;

/**
 * Title:绑定数据库中的列
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 09:39
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String value() default "";
}
