package net.xconfig.surl.tool;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/13 18:24
 */
public class Result {

    private boolean success;

    private String message;

    private Object data;

    private Result() {
    }

    private Result(boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static Result fail(String message) {
        return new Result(false, message, null);
    }

    public static Result success(){
        return new Result(true, "执行成功！", null);
    }

    public static Result success(String message){
        return new Result(true, message, null);
    }

    public static Result success(Object data){
        return new Result(true, "执行成功！", data);
    }

    public Result addData(Object key, Object value){
        if (data == null){
            data = new HashMap();
        }
        Map map = (Map) data;
        map.put(key, value);
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
