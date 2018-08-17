package cn.xconfig.sql;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/16 09:25
 */

import cn.xconfig.annotation.Column;
import cn.xconfig.annotation.DbExclude;
import cn.xconfig.annotation.Table;
import cn.xconfig.exception.SurlException;
import cn.xconfig.pojo.BasePojo;
import cn.xconfig.tool.ClassTool;
import cn.xconfig.tool.StringTool;
import com.google.common.collect.Sets;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

public class BaseSQLProvider<T extends BasePojo> {


    /**
     * 通用更新
     * @param t
     * @return
     */
    public String update(final T t, String ... fields){
        Table table = t.getClass().getAnnotation(Table.class);
        String tableName = table.tableName();
        Set<String> pks = Sets.newHashSet(table.pk());

        SQL sql = new SQL().UPDATE(tableName);

        for (String fieldName : fields) {
            Field field = ClassTool.getField(t.getClass(), fieldName);
            if (field == null){
                throw new SurlException(t.getClass().getName() + "不存在" + fieldName + "字段！");
            }
            DbExclude dbExclude = field.getAnnotation(DbExclude.class);
            if (dbExclude != null){
                throw new SurlException("进制将@DbEclude修饰字段更新到数据库！");
            }
            String columnName = fieldName;
            Column column = field.getAnnotation(Column.class);
            if (column != null && StringTool.isNotEmpty(column.value())){
                columnName = column.value();
            }
            if (pks.contains(fieldName)){
                throw new SurlException("不允许对pk：" + columnName + "做更新操作！");
            }
            sql.SET(columnName + "=#{" + fieldName + "}");
        }

        for (String pk : pks) {
            Field field = ClassTool.getField(t.getClass(), pk);
            String columnName = pk;
            Column column = field.getAnnotation(Column.class);
            if (column != null && StringTool.isNotEmpty(column.value())){
                columnName = column.value();
            }
            sql.WHERE(columnName + "=#{" + pk + "}");
        }

        return sql.toString();
    }


    /**
     * 通用新增
     * @param t
     * @return
     */
    public String insert(final T t){
        Table table = t.getClass().getAnnotation(Table.class);
        String tableName = table.tableName();
        Set<String> pk = Sets.newHashSet(table.pk());

        SQL sql = new SQL().INSERT_INTO(tableName);
        List<Field> fields = ClassTool.getAllFields(t.getClass(), null);
        for (Field field : fields) {
            DbExclude dbExclude = field.getAnnotation(DbExclude.class);
            if (dbExclude != null){
                continue;
            }
            String columnName = field.getName();
            Column column = field.getAnnotation(Column.class);
            if (column != null && StringTool.isNotEmpty(column.value())){
                columnName = column.value();
            }
            if (pk.contains(field.getName())){
                continue;
            }
            sql.VALUES(columnName, "#{" + field.getName() + "}");
        }
        return sql.toString();
    }



}
