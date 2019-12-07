package xin.kevincheng.my.shop.commons.dao;

import java.io.Serializable;

/**
 * @author kc
 * @title
 * @description The class BaseResult is for
 * @date Create in 18:35 2019/12/7
 */
public class BaseResult implements Serializable {

    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_AUTHORIZATION_DENIED = 403;
    public static final int STATUS_NOT_FOUND = 404;
    public static final int STATUS_SERVER_ERROR = 500;

    private int status;

    private String message;

    public static BaseResult success() {
        return new BaseResult(STATUS_SUCCESS, "Success!");
    }

    public static BaseResult success(String message) {
        BaseResult rs = success();
        rs.setMessage(message);
        return rs;
    }

    public static BaseResult fail() {
        return new BaseResult(STATUS_SERVER_ERROR, "Failed!");
    }

    public static BaseResult fail(String message) {
        BaseResult rs = fail();
        rs.setMessage(message);
        return rs;
    }

    public BaseResult(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
