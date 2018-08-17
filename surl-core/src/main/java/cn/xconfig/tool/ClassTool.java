package cn.xconfig.tool;

import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 10:24
 */
public class ClassTool {


    /**
     * 递归获取所有字段
     *
     * @param clazz
     * @param fieldList
     * @return
     */
    public static List<Field> getAllFields(Class clazz, List<Field> fieldList) {
        if (fieldList == null) {
            fieldList = Lists.newArrayList();
        }
        if (clazz.getName().equals("java.lang.Object")) {
            return fieldList;
        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                fieldList.add(field);
            }
        }
        return getAllFields(clazz.getSuperclass(), fieldList);
    }


    public static Field getField(Class clazz,String fieldName){
        List<Field> allFields = getAllFields(clazz, null);
        for (Field field : allFields) {
            if (field.getName().equals(fieldName)){
                return field;
            }
        }
        return null;
    }


}
