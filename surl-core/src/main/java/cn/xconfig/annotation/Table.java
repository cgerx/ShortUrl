package cn.xconfig.annotation;

import java.lang.annotation.*;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 10:36
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Table {

    String tableName();


    String[] pk() default {"id"};

}
