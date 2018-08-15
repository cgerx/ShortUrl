package net.xconfig.surl.exception;

/**
 * Title:
 * Description:
 * Project: ShortUrl
 * Author: cg
 * Create Time:2018/8/13 13:42
 */
public class SurlException extends RuntimeException{

    public SurlException(){
        super();
    }

    public SurlException(String message){
        super(message);
    }

    public SurlException(Throwable cause){
        super(cause);
    }

    public SurlException(String message, Throwable cause){
        super(message, cause);
    }

}
